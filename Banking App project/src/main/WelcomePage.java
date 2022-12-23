package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

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
    JButton btnTransfer = new JButton("Transfer  Money");
    JButton btnSettings = new JButton("Manage Settings");

    String userNumber= null;
    JLabel lblUserNumber = new JLabel();



    JFrame frame = new JFrame();
    JLabel lblWelcome = new JLabel();

    JLabel lblIban = new JLabel();
    JLabel lblBalance = new JLabel();

    JButton btnLogout = new JButton("Logout");
    JButton btnShare = new JButton("Share");
    JButton btnContactUS = new JButton("Contact Us");

    JLabel lblBgImage = new JLabel();
    ImageIcon BgImage =new ImageIcon(
            "/Users/abdo/Documents/GitHub/java_projects/Banking App project/src/main/RedLION_wallpaper(2).jpg");

    JMenuBar MenuBar = new JMenuBar();

    JLabel lblYourCard = new JLabel();
    public double balance = 1200;



    String userID;
    /**
     *Constructor and wellcome page
     * @param userID
     */
    // CONSTUCTOR FOR THE WELCOME PAGE
    WelcomePage(String userID){
        this.userID = userID;
        add(MenuBar);
        btnLogout.setBounds(20 , 700  ,200 ,35);
        btnTransfer.setBounds(20 , 600  ,200 ,35);
        btnSettings.setBounds(20 , 500 ,200 ,35);
        btnContactUS.setBounds(20,400,200,35);
        add(btnTransfer);
        add(btnSettings);
        add(btnLogout);
        add(btnContactUS);



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

        lblUserNumber.setBounds(800 , 210 , 400 ,200);
        lblUserNumber.setFont(new Font("name" , Font.BOLD  , 10));

        lblIban.setBounds(800,270 ,300 ,35);
        lblBalance.setForeground(Color.white);
        lblIban.setForeground(Color.white);

        lblUserNumber.setText("+90 555 14 531 14");
        lblUserNumber.setForeground(Color.WHITE);

        setBackground(Color.GRAY);
        add(lblIban);
        add(lblBalance);
        add(lblWelcome);
        add(lblUserNumber);
        frame.setLayout(null);
        frame.setSize(1400 , 1000);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        setVisible(true);
        setLayout(null);
        setSize(frame.getSize());
        frame.add(this);
        btnContactUS.addActionListener(this);
        btnTransfer.addActionListener(this);
        btnSettings.addActionListener(this);
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


        if(e.getSource() == btnContactUS){
            new client();
        }
        if(e.getSource() ==btnTransfer){
            btnAddMoney();
        }
        if(e.getSource() == btnSettings){
        btnSettings();        }

    }

     double AddedMoney;


    /**
     * Method to add balance
     */
    public void btnAddMoney(){
        /**
         * JOptionPane.showInputDialog(
         *                     null,
         *                     "you hvae successfully Logged out! ",
         *                     "LOGOUT", JOptionPane.INFORMATION_MESSAGE,
         *                     banklogo1);
         */
        JOptionPane.showMessageDialog(
                null,
                "Please enter the amount you want to deposit: ",
                "Deposit", JOptionPane.INFORMATION_MESSAGE,
                banklogo1);
         AddedMoney = Double.parseDouble(JOptionPane.showInputDialog("Amount:" ,
                 JOptionPane.INFORMATION_MESSAGE));
        balance += AddedMoney;
        JOptionPane.showMessageDialog(
                null,
                "Thanks for depositing money, Your new balance is: " + balance,
                "Deposit", JOptionPane.INFORMATION_MESSAGE,
                banklogo1);
        lblBalance.setText("Available Balance is: " + balance + "TL");
    }

    /**
     * Method to set Settings to your account
     */
    Object[] options = { "Change your name ", "Change your Number"  };
    public void btnSettings(){


        int choice = JOptionPane.showOptionDialog(null, "Choose what Operation do you want to do", "Option",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                options, options[0]);
        if(choice == 0 ){
            userID = JOptionPane.showInputDialog("Enter your new name: ");
            lblWelcome.setText("Welcome: " + userID);
        }
        if(choice ==1){
            try {
                int tempNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter your new Number: "));
                userNumber = tempNumber + "";
                lblUserNumber.setText(userNumber);
            }catch(Exception e ){
                System.out.println("Error: "+ e);
            }
        }
        lblUserNumber.setText(userNumber);
    }

    /**
     * Client class to connect to the server
     */
     static class client   {

        public static void main(String[] args)  throws  Exception{
            Socket socket = null;
            BufferedWriter bufferedWriter = null;
            BufferedReader bufferedReader = null;
            ///
            BufferedWriter bufferedWriter1 = null;
            BufferedReader bufferedReader1 = null;
            InputStreamReader inputStreamReader1 = null;
            OutputStreamWriter outputStreamWriter1= null;
            ///
            InputStreamReader inputStreamReader = null;
            OutputStreamWriter outputStreamWriter= null;

            try{
                socket = new Socket("localhost"  , 1177);
                inputStreamReader = new InputStreamReader(socket.getInputStream());
                outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
                bufferedReader = new BufferedReader(inputStreamReader);
                bufferedWriter = new BufferedWriter(outputStreamWriter);
                ///
                //  inputStreamReader1 = new InputStreamReader(socket.getInputStream());
                //outputStreamWriter1 = new OutputStreamWriter(socket.getOutputStream());
                bufferedReader1 = new BufferedReader(inputStreamReader);
                bufferedWriter1 = new BufferedWriter(outputStreamWriter);
                ///
                Scanner scanner = new Scanner(System.in);
                /**
                 * String msgFromClient = bufferedReader.readLine();
                 *                 System.out.println("client: " + msgFromClient);
                 */
                while (true){
                    ///
                    String msgFromServer = bufferedReader1.readLine();
                    System.out.println("Server: " + msgFromServer);
//                bufferedWriter1.write("Msg Recived!");
//                bufferedWriter1.newLine();
//                bufferedWriter1.flush();
                    ///
                    String msgToSend = scanner.nextLine();
                    bufferedWriter.write(msgToSend);
                    bufferedWriter.newLine();
                    bufferedWriter.flush();

                    System.out.println("Client 1: " + bufferedReader.readLine());
                    if(msgToSend.equalsIgnoreCase("BYE"))
                        break;
                }
            }catch (Exception e){}

            finally {
                if(socket != null)
                    socket.close();
                if(bufferedReader != null)
                    bufferedReader.close();
                if(bufferedWriter != null)
                    bufferedWriter.close();
                if(outputStreamWriter != null)
                    outputStreamWriter.close();

            }
        }
    }

}
