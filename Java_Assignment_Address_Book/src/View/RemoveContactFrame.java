package View;

import javax.swing.*;
import java.awt.*;

public class RemoveContactFrame extends JFrame {
    JTextField delname;
    JButton del;
    JPanel add;
    JLabel head;
    JPanel details;

    public RemoveContactFrame(){
        super("Delete Contact");
        setLayout(new FlowLayout());
        add= new JPanel();
        head =new JLabel("Enter the name to delete");
        head.setFont(new Font("Enter the name to delete", Font.PLAIN, 20));
        add.add(head);
        add(add);

        details = new JPanel();
        delname = new JTextField("Name");
        del = new JButton("Delete Details");
        details.add(delname);
        details.add(del);
        setSize(400,300);
        add(details);
    }

    public JButton getDel() {
        return del;
    }

    public JTextField getDelname() {
        return delname;
    }
}
