package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SaveInput {
    public static void main(String[] args) {
    SaveInput s = new SaveInput();
    s.getdata();
}


    public void getdata()  {
        Scanner input = new Scanner(System.in);
        System.out.println("Whats your name?");
        String name = input.nextLine();
        System.out.println("Whats your Number?");
        int number = input.nextInt();

        File file = new File("data.txt");
        PrintWriter print;
        try {
            print = new PrintWriter(file);
            print.println(name);
            print.println(number);
            print.close();

            System.out.println("your Name  and number have been added to the Database, Thanks " + name );

        } catch (Exception e) {
            e.printStackTrace();
        }



    }}

