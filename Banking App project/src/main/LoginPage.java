package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;


public class LoginPage implements ActionListener , KeyListener {
    // LOGIN PAGE IS TO CHECK  THE USER's DATA
    JFrame frame = new JFrame();

    ImageIcon banklogo1 = new ImageIcon(
            "/Users/abdo/Documents/GitHub/java_projects/Banking App project/src/main/Banking App project.png");

    JLabel lblIcone = new JLabel();
    JLabel lblBank = new JLabel("MIB");

    JButton btnSignup = new JButton("SignUp");
    JButton btnLogin = new JButton("Login");
    JButton btnReset = new JButton("reset");
    JTextField txtuser = new JTextField();
    JTextField txtPassword = new JPasswordField();
    JLabel lblUser = new JLabel("Username");
    JLabel lblPassword = new JLabel("password");
    JLabel lblMessage = new JLabel();


    HashMap<String , String > loginInfo = new HashMap<String , String>();

    /**
     *
     * @param loginInfo_Org
     */
    public  LoginPage(HashMap< String , String > loginInfo_Org){
        // CREATING THE FRAME AND SETTING ITS SETTINGS
        loginInfo = loginInfo_Org;

        // SET THE NAME OF THE BANK
        lblBank.setFont(new Font("BANK" , Font.BOLD , 30));
        lblBank.setBounds(250,125 , 100 , 100);
        frame.add(lblBank);
        // SET THE BANK LOGO
        lblIcone.setIcon(banklogo1);
        lblIcone.setBounds(225 , 50 , 150 , 100);


        lblUser.setBounds(125 ,200 ,75 ,25);
        lblPassword.setBounds(125 ,250 ,75 ,25);
        lblMessage.setBounds(150,250,250 , 200);
        lblMessage.setFont(new Font("font" , Font.ITALIC , 20));

        txtuser.setBounds(200, 200 , 200 ,25);
        txtPassword.setBounds(200, 250 , 200 ,25);

        btnLogin.setBounds(125, 300 , 100 , 25);
        btnReset.setBounds(225, 300 , 100 ,25  );
        btnSignup.setBounds(325, 300 , 100 ,25  );
        btnSignup.addActionListener(this);
        btnLogin.addActionListener(this);
        btnReset.addActionListener(this);

        txtPassword.addKeyListener(this);

        // ADD THE DATA TO THE FRAME
        frame.add(new JLabel(new ImageIcon(
                "/Users/abdo/Documents/GitHub/java_projects/Banking App project/src/main/Banking App project.png")));



        frame.add(lblIcone);

        frame.add(btnLogin);
        frame.add(btnReset);
        frame.add(btnSignup);
        frame.add(txtuser);
        frame.add(txtPassword);
        frame.add(lblMessage);
        frame.add(lblUser);
        frame.add(lblPassword);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(600 , 600);
        frame.setLayout(null);
        frame.setVisible(true);




    }

    /**
     *
     * @param e
     */

    // CREATING THE ACTIONLISTNER TO CONNECT THE BUTTONS WITH THE LABELS
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == btnReset){
            txtuser.setText("");
            txtPassword.setText("");
        }

        if(e.getSource() == btnLogin){
           checkLoginInfo();
        }
        if (e.getSource() == btnSignup){
            new SignupPage();
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            checkLoginInfo();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    // METHOD TO CHECK IF THE USER AND PASSWORD ARE CORRECT OR NOT!
    public void checkLoginInfo(){
        String userID =  txtuser.getText();
        String userPassword = String.valueOf(txtPassword.getText());
        System.out.println(userPassword);
        // Check the username and password
        if(loginInfo.containsKey(userID)){
            if(loginInfo.get(userID).equals(userPassword)){
                lblMessage.setForeground(Color.green);
                lblMessage.setText("WELCOME: " + userID);
                frame.dispose();
                WelcomePage welcomePage = new WelcomePage(userID);
            }
            else{
                lblMessage.setForeground(Color.red);
                lblMessage.setText("wrong password");}
        }
        else{
            lblMessage.setForeground(Color.red);
            lblMessage.setText("Username not found!");}
    }
}
