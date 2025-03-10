package DataVizualizer;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileOpener {
    public static Object[][] readFile(String fileName) throws IOException {
        String contents = Files.readString(Path.of(fileName), StandardCharsets.UTF_8);

        List<String> lines = List.of(contents.split("\n"));
        ArrayList<Object[]> studentDataStream;

        studentDataStream = lines.stream()
                .skip(1)
                .map(line -> line.split(","))
                .map(Stream::parseData)
                .map(StudentGradeData::toObjectArray)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        return studentDataStream.toArray(new Object[0][0]);
    }

}
