package DataVizualizer;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class DetailsPanel extends JPanel {
    private final JLabel detailsLabel;

    public DetailsPanel(JTable table) {
        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(1000, 100));
        detailsLabel = new JLabel("Select an entry to see details");
        this.setBackground(Color.GRAY);

        this.add(detailsLabel, BorderLayout.CENTER);
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting() && table.getSelectedRow() != -1) {
                    StringBuilder details = new StringBuilder();
                    for (int i = 0; i < table.getColumnCount(); i++) {
                        details.append(table.getValueAt(table.getSelectedRow(), i)).append(", ");
                    }
                    detailsLabel.setText(details.toString());
                }
            }
        });
    }
}
