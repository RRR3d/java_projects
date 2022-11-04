package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage  implements ActionListener {

    // CREATE THE WELLCOME PAGE

    // SET THE NAME OF THE BANK
    // SET THE BANK LOGO
    ImageIcon banklogo1 = new ImageIcon(
            "/Users/abdo/Documents/GitHub/java_projects/Banking App project/src/main/Banking App project.png");
    JLabel lblIcone = new JLabel();
    JLabel lblBank = new JLabel("MIB");

    JFrame frame = new JFrame();
    JLabel lblWelcome = new JLabel();

    JLabel lblIban = new JLabel();
    JLabel lblBalance = new JLabel();

    JButton btnLogout = new JButton("Logout");

    public double balance = 1029;

    /**
     *
     * @param userID
     */
    // CONSTUCTOR FOR THE WELCOME PAGE
    WelcomePage(String userID){
        btnLogout.setBounds(400 , 400  ,200 ,35);
        frame.add(btnLogout);

        btnLogout.addActionListener(this);
        lblBank.setFont(new Font("BANK" , Font.BOLD , 30));
        lblBank.setBounds(250,125 , 100 , 100);
        lblIcone.setIcon(banklogo1);
        lblIcone.setBounds(225 , 50 , 150 , 100);
        frame.add(lblBank);
        frame.add(lblIcone);


        lblWelcome.setBounds(0 , 200 ,200 , 35);
        lblWelcome.setFont(new Font(null , Font.BOLD | Font.ITALIC , 25));
        lblWelcome.setText("Welcome "+ userID);
        lblWelcome.setFont(new Font( "font"  , Font.ITALIC , 25) );
        // Account Details
        lblBalance.setText("Available Balance is: " + balance + "TL");
        lblIban.setText(" Your Iban: TR 3391 8319 4319 4931");

        lblBalance.setBounds(5 , 250 , 300 ,35);
        lblIban.setBounds(0,270 ,300 ,35);

        frame.setBackground(Color.DARK_GRAY);
        frame.add(lblIban);
        frame.add(lblBalance);
        frame.add(lblWelcome);
        frame.setLayout(null);
        frame.setSize(600 , 600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
