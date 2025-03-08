package DataVizualizer;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class FileOpener {
    private String fileName;

    public FileOpener(String fileName) {
        this.fileName = fileName;
    }

    public ArrayList<String> getLines() {
        ArrayList<String> lines = new ArrayList<String>();
        Scanner fileScan;

        try {
            fileScan = new Scanner(new File(fileName), StandardCharsets.UTF_8);
        } catch (IOException e) {
            return lines;
        }

        while (fileScan.hasNext()) {
            lines.add(fileScan.nextLine());
        }

        return lines;
    }


    public static HashSet<String> getWords(String fileName, String delimiter) {
        String contents;

        try {
            contents = Files.readString(Path.of(fileName), StandardCharsets.UTF_8);
        } catch (IOException e) {
            return new HashSet<String>();
        }

        List<String> wordList = List.of(contents.split(delimiter));
        HashSet<String> words = new HashSet<String>();
        words.addAll(wordList);
        return words;
    }
}
