package View;

import javax.swing.*;

public class ViewAllContactsFrame extends JFrame {
    CentralPanel cp;

    public ViewAllContactsFrame(){
        cp = new CentralPanel();
        add(cp);
        setSize(800,500);
    }

    public CentralPanel getCp() {
        return cp;
    }
}
