package DataVizualizer;

import java.io.IOException;
import java.util.Arrays;

public class Runnable {
    public static void main(String[] args) throws IOException {
        Object[][] data = FileOpener.readFile("Students_Grading_Dataset.csv");
        System.out.println(Arrays.toString(data[0]));
        System.out.println(Arrays.toString(data[10]));
        System.out.println("Total Entries: " + data.length);

        TablePanel.createTable(data);
    }
}
