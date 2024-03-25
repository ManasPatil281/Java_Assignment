package View;

import javax.swing.*;
import java.awt.*;

public class AddContactFrame extends JFrame {
    JPanel add;
    JLabel head;
    JPanel details;
    JTextField name;
    JTextField phoneNumber;
    JTextField emailId;
    JTextField address;
    JButton addDetails;

    public AddContactFrame(){
        super("Add Contact");
        setLayout(new FlowLayout());
        add= new JPanel();
        head =new JLabel("Enter the Details to add the contacts");
        head.setFont(new Font("Enter the Details to add the contacts", Font.ITALIC, 30));
        add.add(head);
        add(add);

        details = new JPanel();
        name = new JTextField("Name");
        phoneNumber = new JTextField("PhoneNumber");
        emailId = new JTextField("Email_Id");
        address = new JTextField("Address");
        addDetails = new JButton("Add the Contact");
        details.add(name);
        details.add(phoneNumber);
        details.add(emailId);
        details.add(address);
        details.add(addDetails);


        add(details);
        setSize(500,300);
    }


    public JTextField getname() {
        return name;
    }

    public JButton getAddDetails() {
        return addDetails;
    }

    public JTextField getAddress() {
        return address;
    }

    public JTextField getEmailId() {
        return emailId;
    }

    public JTextField getPhoneNumber() {
        return phoneNumber;
    }

}
