package DataVizualizer;

import javax.swing.*;
import java.awt.*;

public class TablePanel extends JPanel {
    public static void createTable(Object[][] data) {
        JFrame frame = new JFrame("Student Grade Data Vizualizer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.setBackground(Color.GREEN);

        String[] columnNames = {
                "Student ID", "First Name", "Last Name", "Student Email", "Gender", "Age", "Department", "Attendance", "Midterm Score", "Final Score",
                "Assignment Average Score", "Quiz Average Score", "Participation Score", "Projects Score", "Total Score", "Grade", "Study Hours", "Extracurricular Activities",
                "Internet Access", "Parent Education Level", "Family Income Level", "Stress Level", "Hours of Sleep per Week"
        };

        JTable table = new JTable(data, columnNames);
        JScrollPane scroll = new JScrollPane(table);
        frame.add(scroll, BorderLayout.CENTER);

        DetailsPanel details = new DetailsPanel(table);
        details.setSize(500, 500);
        details.setBackground(Color.BLUE);
        frame.add(details);

        frame.setVisible(true);
    }
}
