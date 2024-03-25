package View;

import javax.swing.*;
import java.awt.*;

public class InitialPanel extends JPanel {
    CentralPanel cp;
    Buttons butt;

    public InitialPanel(){
        JPanel head = new JPanel();
        JLabel heading = new JLabel("Welcome to  the Address Book!!!!");
        head.add(heading);

        butt = new Buttons();

        add(head);
        add(butt);

    }

    public Buttons getButt() {
        return butt;
    }
}
