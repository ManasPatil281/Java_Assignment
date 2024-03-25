package View;

import javax.swing.*;

public class ConfirmationFrameUpdate extends JFrame{
    public ConfirmationFrameUpdate(){
        setTitle("Contact Updated Successfully");
        setSize(300, 200);
        setLocationRelativeTo(null); // Center the frame on the screen
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close this frame only
        JLabel label = new JLabel("Contact updated successfully!");
        add(label);
        setVisible(true); // Make the frame visible
    }
}
