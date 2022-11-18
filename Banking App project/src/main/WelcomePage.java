package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage extends JPanel  implements ActionListener {

    // CREATE THE WELLCOME PAGE

    // SET THE NAME OF THE BANK
    // SET THE BANK LOGO
    ImageIcon banklogo1 = new ImageIcon(
            "/Users/abdo/Documents/GitHub/java_projects/Banking App project/src/main/HSBC_NEWLOGO(2).jpg");
    ImageIcon CardImage = new ImageIcon(
            "/Users/abdo/Documents/GitHub/java_projects/Banking App project/src/main/credit_card_HSBC(1).png");
    JLabel lblIcone = new JLabel();
    JLabel lblBank = new JLabel("MIB");
    JLabel lblCard = new JLabel();



    JFrame frame = new JFrame();
    JLabel lblWelcome = new JLabel();

    JLabel lblIban = new JLabel();
    JLabel lblBalance = new JLabel();

    JButton btnLogout = new JButton("Logout");
    JButton btnShare = new JButton("Share");

    JLabel lblBgImage = new JLabel();
    ImageIcon BgImage =new ImageIcon(
            "/Users/abdo/Documents/GitHub/java_projects/Banking App project/src/main/RedLION_wallpaper(2).jpg");


    JLabel lblYourCard = new JLabel();
    public double balance = 1029;

    /**
     *Constructor and wellcome page
     * @param userID
     */
    // CONSTUCTOR FOR THE WELCOME PAGE
    WelcomePage(String userID){
        btnLogout.setBounds(1050 , 700  ,200 ,35);
        add(btnLogout);

        lblBgImage.setBounds(0,-200,1400 ,1000);
        lblBgImage.setIcon(BgImage);


        btnLogout.addActionListener(this);
        lblBank.setFont(new Font("BANK" , Font.BOLD , 30));
        lblBank.setBounds(625,125 , 100 , 100);
        lblIcone.setIcon(banklogo1);
        lblIcone.setBounds(950 , 20 , 300 , 200);
        lblIcone.setForeground(Color.white);

        lblYourCard.setFont(new Font(null , Font.BOLD|Font.ITALIC , 30));
        lblYourCard.setBounds(600 , 275 ,30 ,30);
        lblCard.setIcon(CardImage);
        lblCard.setBounds(850,300 ,400 ,400);


        add(lblYourCard);
        add(lblCard);
        //add(lblBank);
        add(lblIcone);



        lblWelcome.setBounds(775 , 180 ,200 , 50);
        lblWelcome.setFont(new Font(null , Font.BOLD | Font.ITALIC , 30));
        lblWelcome.setText("Welcome "+ userID + ",");
        lblWelcome.setFont(new Font( "font"  , Font.ITALIC , 25) );
        lblWelcome.setForeground(Color.WHITE);

        lblBalance.setFont(  new Font(null , Font.BOLD | Font.ITALIC , 20));
        // Account Details
        lblBalance.setText("Available Balance is: " + balance + "TL");

        lblIban.setText(" Your Iban: TR " + (int) (Math.random() *10000 ) + " "
                + (int) (Math.random() *10000 ) + " "+ (int) (Math.random() *10000 ) +
                " "+ (int) (Math.random() *10000 ));

        lblBalance.setBounds(800 , 160 , 400 ,200);
        lblIban.setBounds(800,270 ,300 ,35);
        lblBalance.setForeground(Color.white);
        lblIban.setForeground(Color.white);

        setBackground(Color.GRAY);
        add(lblIban);
        add(lblBalance);
        add(lblWelcome);
        frame.setLayout(null);
        frame.setSize(1400 , 1000);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        setVisible(true);
        setLayout(null);
        setSize(frame.getSize());
        frame.add(this);

        add(lblBgImage);
    }

    @Override
    /**
     * GET THE USER TO THE MAIN MENU
     */
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == btnLogout){
            userspasswords usersPasswords = new userspasswords();
            LoginPage loginPage = new LoginPage(usersPasswords.getLoginInfo());
           // JOptionPane.showMessageDialog(null , "You have succefully logged out ! ");

            JOptionPane.showMessageDialog(
                    null,
                    "you hvae successfully Logged out! ",
                    "LOGOUT", JOptionPane.INFORMATION_MESSAGE,
                    banklogo1);
        }
    }
}
