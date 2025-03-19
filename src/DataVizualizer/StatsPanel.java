package DataVizualizer;

import javax.swing.*;
import java.awt.*;

public class StatsPanel extends JPanel {

    public StatsPanel(JTable table) {
        this.setPreferredSize(new Dimension(300, 100));
        this.setBackground(Color.LIGHT_GRAY);

        JLabel avgScore = new JLabel("Average Total Score: " + getAvgScore(table));
        JLabel avgAge = new JLabel("Average Age: " + getAvgAge(table));
        JLabel avgAttendance = new JLabel("Average Attendance: " + getAvgAttendance(table));

        this.add(avgScore);
        this.add(avgAge);
        this.add(avgAttendance);

    }

    private float getAvgAttendance(JTable table) {
        float score = 0;
        float total = 0;
        Object tableValue;
        for (int i = 0; i < table.getRowCount(); i++) {
            tableValue = table.getValueAt(i, 7);
            if (tableValue instanceof Float && (Float)tableValue != -1) {
                score += (float)tableValue;
            }
            total++;
        }

        return score / total;
    }

    private float getAvgAge(JTable table) {
        float score = 0;
        float total = 0;
        Object tableValue;
        for (int i = 0; i < table.getRowCount(); i++) {
            tableValue = table.getValueAt(i, 5);
            if (tableValue instanceof Integer && (Integer)tableValue != -1) {
                score += (float)(int)tableValue;
            }
            total++;
        }

        return score / total;
    }

    private float getAvgScore(JTable table) {
        float score = 0;
        float total = 0;
        Object tableValue;
        for (int i = 0; i < table.getRowCount(); i++) {
            tableValue = table.getValueAt(i, 14);
            if (tableValue instanceof Float && (Float)tableValue != -1) {
                score += (float)tableValue;
            }
            total++;
        }

        return score / total;
    }
}
