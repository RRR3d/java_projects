package main;

import java.io.*;
import java.util.Scanner;

public class advice {
    public static void main(String[] args) throws IOException {
       // Scanner advice = new Scanner(
        //        new File("/Users/abdo/Documents/GitHub/java_projects/HomeWork4/src/main/Q6.txt"));
        String advice = new Scanner(new File(
                "/Users/abdo/Documents/GitHub/java_projects/HomeWork4/src/main/Q6.txt")
                        ).useDelimiter("\\Z").next();

        System.out.println("Your Advice for today is: \n"+  advice);
        Scanner newAdvice = new Scanner(System.in);
        System.out.println("please enter a new advice: ");
        String nAdvice = newAdvice.nextLine();
        try(FileWriter fileWriter = new
                FileWriter("/Users/abdo/Documents/GitHub/java_projects/HomeWork4/src/main/Q6.txt")){
            fileWriter.write(nAdvice);
            System.out.println("Your advice has been saved. \nThanks... ");
        }

    }
}
