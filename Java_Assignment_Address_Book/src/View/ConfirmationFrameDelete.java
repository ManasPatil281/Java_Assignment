package View;

import javax.swing.*;

public class ConfirmationFrameDelete extends JFrame {
    public ConfirmationFrameDelete(){
        setTitle("Contact Deleted Successfully");
        setSize(300, 200);
        setLocationRelativeTo(null); // Center the frame on the screen
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close this frame only
        JLabel label = new JLabel("Contact Deleted successfully!");
        add(label);
        setVisible(true); // Make the frame visible
    }
}
