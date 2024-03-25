package View;

import javax.swing.*;
import java.awt.*;

public class EditContact extends JFrame {
    JTextField name;
    JTextField phoneNumber;
    JTextField emailId;
    JTextField address;
    JTextField getname;


    JPanel upp;

    JPanel label;
    JLabel l;
    JButton add1;
    JTextField index;
    JButton get;

    public EditContact(){
        setSize(900, 400);

        label = new JPanel();
        l = new JLabel("Please edit the details of address book");
        l.setFont(new Font("Please edit the details of address book", Font.PLAIN, 20));
        setLayout(new GridLayout(4, 0, 20,20));
        label.add(l);
        add(label);

        JPanel getDetails = new JPanel();
        getname = new JTextField("Enter the name of the person");
        get = new JButton("Get the person");
        getDetails.add(getname);
        getDetails.add(get);
        add(getDetails);
        upp = new JPanel();
        name = new JTextField();
        phoneNumber = new JTextField();
        emailId = new JTextField();
        address = new JTextField();

        add1 = new JButton("EDIT THE CONTACT");

        upp.add(name);
        upp.add(phoneNumber);
        upp.add(emailId);
        upp.add(address);


        upp.add(add1);
        upp.setVisible(false);
        add(upp);
    }

    public JTextField getGetname() {
        return getname;
    }

    public JTextField getEmailId() {
        return emailId;
    }

    public JTextField getAddress() {
        return address;
    }

    public JTextField getPhoneNumber() {
        return phoneNumber;
    }

    public JPanel getUpp() {
        return upp;
    }

    public JButton getGet() {
        return get;
    }


    public JTextField getname() {
        return name;
    }

    public JButton getAdd1() {
        return add1;
    }
}
