package DataVizualizer;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class DetailsPanel extends JPanel {
    private final JLabel detailsLabel;

    public DetailsPanel(JTable table) {
        setLayout(new BorderLayout());
        detailsLabel = new JLabel("Select an entry to see details");

        add(detailsLabel, BorderLayout.CENTER);
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting() && table.getSelectedRow() != -1) {
                    detailsLabel.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
                }
            }
        });
    }
}
