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
        users_passwords usersPasswords = new users_passwords();
        LoginPage loginPage = new LoginPage(usersPasswords.getLoginInfo());
//        users_passwords us = new users_passwords("fda" , "dfda");
//        usersPasswords.LoginInfo.put("kill","koko");





    }


}
