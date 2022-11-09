package main;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {


       // Create 4 threads for each ball
       Thread th1 = new Thread();
        Thread th2= new Thread();
        Thread th4 = new Thread();
        Thread th3 = new Thread();

        th1.setName("th1");
        th1.start();
        th2.setName("th2");
        th2.start();
        th3.setName("th3");
        th3.start();
        th4.setName("th4");
        th4.start();

     System.out.println(Thread.activeCount());
        System.out.println(th1.getName() + th2.getName() + th3.getName() + th4.getName());
        System.out.println(Thread.activeCount());

     // Create the FRAME to set the panel on it
        JFrame frame = new JFrame();



        // set the 4 threads for the balls to move in
        panel panel = new panel(th1 ,th2 ,th3 ,th4);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);



    }
}
