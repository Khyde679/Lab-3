package DataVizualizer;

import java.io.IOException;

public class Runnable {
    public static void main(String[] args) throws IOException {
        Object[][] data = FileOpener.readFile("Students_Grading_Dataset.csv");
        System.out.println(data[1]);
        System.out.println(data[10]);
    }
}
