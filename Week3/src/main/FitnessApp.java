package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FitnessApp extends JPanel implements ActionListener {
    ImageIcon icon = new ImageIcon(
            "/Users/apple/Downloads/java_projects-main/FittnesApp1/src/com/company/Work-from-home-workout-2.png");
    ;
    JLabel lblBG= new JLabel();

    JButton btnClick =new JButton();
    JFrame frame = new JFrame();
    Font f = new Font("f",Font.BOLD  | Font.ITALIC , 25);
    public FitnessApp() {
        frame.setVisible(true);
        frame.setSize(1300,730);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setLayout(null);

        setVisible(true);
        setSize(frame.getSize());

        //btnClick = new JButton(icon);
        setLayout(null) ;



        lblBG.setIcon(icon);


        lblBG.setBounds(0,0,1300 ,730);


        //btnClick.setFont(f);

        btnClick.addActionListener(this);

        add(btnClick);
        add(lblBG);

    }

    public static void main(String[] args) {
        new FitnessApp();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnClick){
            frame.dispose();
            new WelcomePage();
        }

    }
}
