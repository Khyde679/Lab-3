package DataVizualizer;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class GUIRunnable extends JPanel {
    public static void main(String[] args) throws IOException {
        Object[][] data = FileOpener.readFile("Students_Grading_Dataset.csv");

        JFrame frame = new JFrame("Student Grade Data Visualizer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(1000, 1000));
        TablePanel tablePanel = new TablePanel(data);
        frame.add(tablePanel);

        frame.pack();
        frame.setVisible(true);
    }
}