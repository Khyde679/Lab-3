package DataVizualizer;

import javax.swing.*;
import java.awt.*;

public class StatsPanel extends JPanel {

    public StatsPanel(JTable table) {
        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(100, 100));
        this.setBackground(Color.BLUE);

        JLabel avgScore = new JLabel("Average Total Score: " + getAvgScore(table));
        JLabel avgAge = new JLabel("Average Age: " + getAvgAge(table));
        JLabel avgAttendance = new JLabel("Average Attendance: " + getAvgAttendance(table));

        this.add(avgScore);
        this.add(avgAge);
        this.add(avgAttendance);

    }

    private float getAvgAttendance(JTable table) {
        float score = 0;
        int total = 0;
        for (int i = 0; i < table.getRowCount(); i++) {
            if ((float)table.getValueAt(i, 7) != -1) {
                score += (float)table.getValueAt(i, 7);
            }
            total++;
        }

        return score / total;
    }

    private float getAvgAge(JTable table) {
        float score = 0;
        int total = 0;
        for (int i = 1; i < table.getRowCount(); i++) {
            if ((float)table.getValueAt(i, 5) != -1) {
                score += (float)table.getValueAt(i, 5);
            }
            total++;
        }

        return score / total;
    }

    private float getAvgScore(JTable table) {
        float score = 0;
        int total = 0;
        for (int i = 0; i < table.getRowCount(); i++) {
            if ((float)table.getValueAt(i, 14) != -1) {
                score += (float)table.getValueAt(i, 14);
            }
            total++;
        }

        return score / total;
    }
}
