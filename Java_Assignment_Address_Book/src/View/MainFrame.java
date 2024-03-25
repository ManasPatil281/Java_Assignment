package View;

import javax.swing.*;

public class MainFrame extends JFrame {

    InitialPanel ip;

    public MainFrame(){
        super("Address Book");
        ip  = new InitialPanel();
        add(ip);



        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700,300);
        setVisible(true);
    }

    public InitialPanel getIp() {
        return ip;
    }
}
