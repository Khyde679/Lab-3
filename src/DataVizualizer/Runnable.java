package DataVizualizer;

import java.io.IOException;
import java.util.Arrays;

public class Runnable {
    public static void main(String[] args) throws IOException {
        Object[][] data = FileOpener.readFile("Students_Grading_Dataset.csv");
        System.out.println(Arrays.toString(data[1]));
        System.out.println(Arrays.toString(data[10]));
    }
}
