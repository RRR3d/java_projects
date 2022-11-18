package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;


public class LoginPage extends JPanel implements ActionListener , KeyListener {
    // LOGIN PAGE IS TO CHECK  THE USER's DATA
    JFrame  frame= new JFrame();

    ImageIcon banklogo1 = new ImageIcon(
            "/Users/abdo/Documents/GitHub/java_projects/Banking App project/src/main/HSBC_NEWLOGO(2).jpg");

    JLabel lblBgImage = new JLabel();
    ImageIcon BgImage =new ImageIcon(
            "/Users/abdo/Documents/GitHub/java_projects/Banking App project/src/main/RedLION_wallpaper(2).jpg");

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
     * LOGIN PAGE CONSTRUCTOR  need HASHMAP to be able to get users and passwrods  and check them
     * @param loginInfo_Org
     */
    public  LoginPage(HashMap< String , String > loginInfo_Org){
        // CREATING THE FRAME AND SETTING ITS SETTINGS
        loginInfo = loginInfo_Org;


        // SET THE NAME OF THE BANK
        lblBank.setFont(new Font("BANK" , Font.BOLD , 30));
        lblBank.setBounds(825,225 , 100 , 100);
        //add(lblBank);
        // SET THE BANK LOGO
        lblIcone.setIcon(banklogo1);
        lblIcone.setBounds(900 , 200 , 300 , 200);
        lblBgImage.setBounds(0,-200,1400 ,1000);
        lblBgImage.setIcon(BgImage);

        //setBackground(Color.GRAY);

        lblUser.setBounds(825 ,400 ,75 ,25);
        lblPassword.setBounds(825 ,450 ,75 ,25);
        lblMessage.setBounds(850,450,250 , 200);
        lblMessage.setFont(new Font("font" , Font.ITALIC , 20));

        lblUser.setForeground(Color.white);
        lblPassword.setForeground(Color.white);


        txtuser.setBounds(900, 400 , 200 ,25);
        txtPassword.setBounds(900, 450 , 200 ,25);

        btnLogin.setBounds(825, 500 , 100 , 25);
        btnReset.setBounds(925, 500 , 100 ,25  );
        btnSignup.setBounds(1025, 500 , 100 ,25  );
        btnSignup.addActionListener(this);
        btnLogin.addActionListener(this);
        btnReset.addActionListener(this);

        txtPassword.addKeyListener(this);

        // ADD THE DATA TO THE FRAME
        add(new JLabel(new ImageIcon(
                "Banking App project.png")));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1400 , 1000);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(this);
        setLayout(null);
        //setBackground(Color.GRAY);  //************************************ BG COLOR *****+*************
        setVisible(true);
        setSize(frame.getSize());


        add(lblIcone);


        add(btnLogin);
        add(btnReset);
        add(btnSignup);
        add(txtuser);
        add(txtPassword);
        add(lblMessage);
        add(lblUser);
        add(lblPassword);








        add(lblBgImage);
    }

    /**
     * CREATING THE ACTIONLISTNER TO CONNECT THE BUTTONS WITH THE LABELS
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == btnReset){
            txtuser.setText("");
            txtPassword.setText("");
            new Loading();

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

    /**
     * METHOD TO CHECK IF THE USER AND PASSWORD ARE CORRECT OR NOT!
     */
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
