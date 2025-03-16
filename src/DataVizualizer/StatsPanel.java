package DataVizualizer;

import javax.swing.*;
import java.awt.*;

public class StatsPanel extends JPanel {
    private float avgScore;
    private float avgAge;

    public StatsPanel(Object[][] data) {
        setLayout(new GridLayout(3, 1));
    }
}
