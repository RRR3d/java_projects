package main;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import javax.swing.*;
import java.io.File;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.IOException;

public class Main  extends JFrame {

// RUN CLASS
    public static void main(String[] args) {
        new Loading();
        for(int i = 0 ; i < 20 ; i++){
            try{
                Thread.sleep(100);
                if(i == 19){
                    userspasswords usersPasswords = new userspasswords();
                    LoginPage loginPage = new LoginPage(usersPasswords.getLoginInfo());
                    // System.exit(1);

                }
            }catch(Exception e){
                System.out.println(e);
            }
        }



      // LoadingPage p = new LoadingPage();
        //Thread thread = new Thread(p);
        //thread.start();







//        users_passwords us = new users_passwords("fda" , "dfda");
//        usersPasswords.LoginInfo.put("kill","koko");





    }


}
