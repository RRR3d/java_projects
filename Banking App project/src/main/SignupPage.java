package main;

import javax.swing.*;
import java.awt.*;

public class SignupPage {
     JLabel lblFirstName, lblLastname, lblPhoneNumber, lblTC;
     JTextField txtFristName , txtLastName , txtPhoneNumber, txtTC;
    ImageIcon banklogo1 = new ImageIcon(
            "/Users/abdo/Documents/GitHub/java_projects/Banking App project/src/main/Banking App project.png");
    JLabel lblIcone = new JLabel();
    JLabel lblBank = new JLabel("MIB");

    /**
     * Signup Page to create a new user 
     */
    public SignupPage(){
        JFrame frame = new JFrame();
        frame.setLayout(null);

        // LBL AND ICONE SETT
        lblBank.setFont(new Font("BANK" , Font.BOLD , 30));
        lblBank.setBounds(250,125 , 100 , 100);
        lblIcone.setIcon(banklogo1);
        lblIcone.setBounds(225 , 50 , 150 , 100);
        frame.add(lblBank);
        frame.add(lblIcone);

        lblFirstName = new JLabel("Enter Your First Name: ");
        lblLastname = new JLabel("Enter Your Last Name: ");
        lblPhoneNumber = new JLabel("Enter your Phone Number");
        lblTC = new JLabel("Enter your TC: ");

        txtFristName = new JTextField();
        txtLastName = new JTextField();
        txtPhoneNumber = new JTextField();
        txtTC = new JTextField();

        lblFirstName.setBounds(25 , 200 , 200 ,100);
        lblLastname.setBounds(25 , 225 , 200 ,100);
        lblPhoneNumber.setBounds(25 , 250 , 200 ,100);
        lblTC.setBounds(25 , 275 , 200 ,100);

        frame.add(lblTC);
        frame.add(lblPhoneNumber);
        frame.add(lblFirstName);
        frame.add(lblLastname);

        txtFristName.setBounds(175 , 235 , 200 ,20);
        txtLastName.setBounds(175 , 265 , 200 ,20);
        txtPhoneNumber.setBounds(190 , 290 , 200 ,20);
        txtTC.setBounds(115 ,315 , 200,20 );

        frame.add(txtFristName);
        frame.add(txtLastName);
        frame.add(txtPhoneNumber);
        frame.add(txtTC);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(600 , 600);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
