package View;



import javax.swing.*;
import java.awt.*;
public class SearchContFrame extends JFrame {
    JTextField txt_con_name;
    JButton searchBtn;
    JTextField txt_name;
    JTextField txt_phone;
    JTextField txt_email;
    JTextField txt_addr;
    JPanel label;
    JLabel l;
    JPanel upp;
    public SearchContFrame(){
        setSize(900, 400);

        label = new JPanel();
        l = new JLabel("Search in the Contacts");
        l.setFont(new Font("Search in the Contacts", Font.PLAIN, 20));
        setLayout(new GridLayout(4, 0, 20,20));
        label.add(l);
        add(label);

        JPanel getDetails = new JPanel();
        txt_con_name = new JTextField("Enter the name of the person");
        searchBtn = new JButton("Search");
        getDetails.add(txt_con_name);
        getDetails.add(searchBtn);
        add(getDetails);
        upp = new JPanel();
        txt_name = new JTextField("                     txt_name                  ");
        txt_phone = new JTextField("                      txt_phone               ");
        txt_email = new JTextField("                      txt_email                 ");
        txt_addr = new JTextField("                       txt_addr                              ");
        upp.add(txt_name);
        upp.add(txt_phone);
        upp.add(txt_email);
        upp.add(txt_addr);

        add(upp);
    }

    public JLabel getL() {
        return l;
    }

    public JPanel getLabel() {
        return label;
    }

    public JTextField getTxt_name() {
        return txt_name;
    }

    public JPanel getUpp() {
        return upp;
    }

    public JButton getSearchBtn() {
        return searchBtn;
    }

    public JTextField getTxt_addr() {
        return txt_addr;
    }

    public JTextField getTxt_con_name() {
        return txt_con_name;
    }

    public JTextField getTxt_email() {
        return txt_email;
    }

    public JTextField getTxt_phone() {
        return txt_phone;
    }
}
