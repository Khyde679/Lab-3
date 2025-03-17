package DataVizualizer;

import javax.swing.*;
import java.awt.*;

public class TablePanel extends JPanel {
    private static JTable table;

    TablePanel(Object[][] data) {
        JFrame frame = new JFrame();
        setBackground(Color.GREEN);

        String[] columnNames = {
                "Student ID", "First Name", "Last Name", "Student Email", "Gender", "Age", "Department", "Attendance", "Midterm Score", "Final Score",
                "Assignment Average Score", "Quiz Average Score", "Participation Score", "Projects Score", "Total Score", "Grade", "Study Hours", "Extracurricular Activities",
                "Internet Access", "Parent Education Level", "Family Income Level", "Stress Level", "Hours of Sleep per Week"
        };

        table = new JTable(data, columnNames);
        JScrollPane scroll = new JScrollPane(table);
        frame.add(scroll, BorderLayout.CENTER);
    }

    public JTable getTable() {
        return table;
    }
}
