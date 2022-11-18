package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupPage extends JPanel  implements ActionListener {
     JLabel lblFirstName, lblLastname, lblPhoneNumber, lblTC , lblUserName, lblPassword;
     JTextField txtFristName , txtLastName , txtPhoneNumber, txtTC , txtUserName , txtPassword;
    ImageIcon banklogo1 = new ImageIcon(
            "/Users/abdo/Documents/GitHub/java_projects/Banking App project/src/main/Banking App project.png");
    JLabel lblIcone = new JLabel();
    JLabel lblBank = new JLabel("MIB");
    JButton btnSignUp = new JButton("Sign up");
    JFrame frame = new JFrame();

    /**
     * Signup Page to create a new user
     */
    public SignupPage(){

        setLayout(null);

        // LBL AND ICONE SETT
        lblBank.setFont(new Font("BANK" , Font.BOLD , 30));
        lblBank.setBounds(250,125 , 100 , 100);
        lblIcone.setIcon(banklogo1);
        lblIcone.setBounds(225 , 50 , 150 , 100);
        add(lblBank);
        add(lblIcone);

        lblUserName = new JLabel("Enter your Username: ");
        lblPassword = new JLabel("Enter your Password: ");
        lblFirstName = new JLabel("Enter Your First Name: ");
        lblLastname = new JLabel("Enter Your Last Name: ");
        lblPhoneNumber = new JLabel("Enter your Phone Number");
        lblTC = new JLabel("Enter your TC: ");

        txtPassword = new JPasswordField();
        txtUserName = new JTextField();
        txtFristName = new JTextField();
        txtLastName = new JTextField();
        txtPhoneNumber = new JTextField();
        txtTC = new JTextField();


        lblFirstName.setBounds(25 , 200 , 200 ,100);
        lblLastname.setBounds(25 , 225 , 200 ,100);
        lblPhoneNumber.setBounds(25 , 250 , 200 ,100);
        lblTC.setBounds(25 , 275 , 200 ,100);
        lblUserName.setBounds(25 , 300 , 200 , 100);
        lblPassword.setBounds(25, 325 , 200 ,100);

        add(lblUserName);
        add(lblPassword);
        add(lblTC);
        add(lblPhoneNumber);
        add(lblFirstName);
        add(lblLastname);

        txtUserName.setBounds(175 , 340 , 200 ,20);
        txtPassword.setBounds(175 ,365 , 200 ,20);
        txtFristName.setBounds(175 , 235 , 200 ,20);
        txtLastName.setBounds(175 , 265 , 200 ,20);
        txtPhoneNumber.setBounds(190 , 290 , 200 ,20);
        txtTC.setBounds(115 ,315 , 200,20 );
        btnSignUp.setBounds(115, 400 , 200 ,20);

        btnSignUp.addActionListener(this);

        add(txtPassword);
        add(txtUserName);
        add(txtUserName);
        add(txtPassword);
        add(txtFristName);
        add(txtLastName);
        add(txtPhoneNumber);
        add(txtTC);
        add(btnSignUp);

        setBackground(Color.GRAY);


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(600 , 600);
        frame.setLayout(null);
        frame.setVisible(true);
        setVisible(true);
        setLayout(null);
        frame.add(this);
        setSize(frame.getSize());

    }

    @Override
    /**
     * ADD USERNAME AND PASSWORD TO THE LOGIN DATABASE
     */
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSignUp){
            String NewUserName = txtUserName.getText();
            String NewPassword = txtPassword.getText();
            userspasswords add = new userspasswords();
            add.add_user(NewUserName , NewPassword);
            userspasswords usersPasswords = new userspasswords();
            frame.dispose();
           // LoginPage loginPage = new LoginPage(usersPasswords.getLoginInfo());
        }
    }
}
