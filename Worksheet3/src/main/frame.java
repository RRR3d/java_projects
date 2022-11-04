package main;

import javax.swing.*;

public class frame extends JFrame {
    panel panel;

    public frame(){


        panel = new panel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
