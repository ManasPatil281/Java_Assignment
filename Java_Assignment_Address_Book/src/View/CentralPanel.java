package View;

import javax.swing.*;
import java.util.ArrayList;

public class CentralPanel extends JPanel {
    ArrayList<JLabel> labels = new ArrayList<>();
    public void createLabels(int count)
    {
        for (int i = 1; i <= count; i++)
        {
            JLabel j = new JLabel();
            labels.add(j);
            this.add(j);
            validate();
            repaint();
        }

    }
    public ArrayList<JLabel> getLabels() {
        return labels;
    }
}
