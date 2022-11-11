package main;

import javax.accessibility.AccessibleIcon;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoadingPage extends JFrame implements  Runnable {
    ImageIcon banklogo1 = new ImageIcon(
            "/Users/abdo/Documents/GitHub/java_projects/Banking App project/src/main/Banking App project.png");
    JLabel lblIcone = new JLabel();
    JLabel lblBank = new JLabel("MIB");
    JLabel lblLoading = new JLabel();
   // Timer timer = new Timer(10, this);

    int x = 300;
    int y = 300;
    int xVelocity = 2;
    int yVelocity = 2;
    int xSize = 100;
    int ysize = 100;


    public LoadingPage() {
        Panel panel = new Panel();
        panel.setSize(600 ,600);

        JFrame frame = new JFrame();
        frame.add(panel);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(600 , 600);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);


        // LBL AND ICONE SETT
        lblBank.setFont(new Font("BANK", Font.BOLD, 30));
        lblBank.setBounds(250, 125, 100, 100);
        lblIcone.setIcon(banklogo1);
        lblIcone.setBounds(225, 50, 150, 100);

        panel.setVisible(true);
        frame.add(lblBank);
        frame.add(lblIcone);
        panel.add(lblBank);
        panel.add(lblIcone);



       // timer.start();


    }

    public void paint(Graphics g1) {
        Graphics2D g = (Graphics2D)  g1;
        g.setColor(Color.red);
        g.fillOval(300 ,300 ,200 ,200 );
        g.drawOval(300 ,300 ,200 ,200);

    }

    public void run(){
        if (x >= 500 || x < 400) {
            xVelocity *= -1;
        }
        x += xVelocity;

        repaint();
    }

}
