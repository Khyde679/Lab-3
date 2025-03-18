package DataVizualizer;

import javax.swing.*;
import java.awt.*;

public class TablePanel extends JPanel {

    TablePanel(Object[][] data) {
        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(700, 500));

        String[] columnNames = {
                "Student ID", "First Name", "Last Name", "Student Email", "Gender", "Age", "Department", "Attendance", "Midterm Score", "Final Score",
                "Assignment Average Score", "Quiz Average Score", "Participation Score", "Projects Score", "Total Score", "Grade", "Study Hours", "Extracurricular Activities",
                "Internet Access", "Parent Education Level", "Family Income Level", "Stress Level", "Hours of Sleep per Week"
        };

        JTable table = new JTable(data, columnNames);
        JScrollPane scroll = new JScrollPane(table);
        this.add(scroll, BorderLayout.CENTER);

        DetailsPanel detailsPanel = new DetailsPanel(table);
        this.add(detailsPanel, BorderLayout.SOUTH);

    }
}