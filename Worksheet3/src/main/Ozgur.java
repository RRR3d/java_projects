package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ozgur extends JFrame implements  Runnable {

    circleOZGUR c1 = new circleOZGUR(400 ,0 , 100 );
    circleOZGUR c2 = new circleOZGUR(0 , 400 , 100 );
    circleOZGUR c3 = new circleOZGUR(400 ,400 , 100 );
    circleOZGUR c4 = new circleOZGUR(0 , 0 ,100 );

    public int c1X = c1.getX();
    public int c2X = c2.getX();
    public int c3Y = c3.getY();
    public int c4Y = c4.getY();


    public void paint(Graphics g){
        super.paint(g); // paint background
        g.fillOval(c1.getX() , c1.getY() , 100 , 100);
        g.setColor(Color.BLUE);
        g.fillOval(c2.getX(), c2.getY()  , 100 , 100 );

        g.setColor(Color.GREEN);
        g.fillOval(c3.getX() , c3.getY() , 100 ,100);

        g.setColor(Color.pink);
        g.fillOval(c4.getX() , c4.getY() , 100 ,100);
        g.setColor(Color.black);
    }

    public int v =5;

    public void move() {

        if(c1X >= 400  ||   c1X < 0){
            v *= -1;}
        c1X += v;

        // *****************************************


        if(c2X>= 400  ||   c2X < 0){
            v *= -1;}
        c2X += v;
        // *****************************************


        if(c3Y >= 400 ||   c3Y < 0){
            v *= -1; }
        c3Y +=  v;
        // *****************************************


        if(c4Y >= 400 ||   c4Y < 0){
            v *= -1; }
        c4Y +=  v;
        // *****************************************

        // Repaint to move the circles
        repaint();
    }

    @Override
    public void run() {
        for(;;) {
            try {
                move();
                Thread.sleep(10);

            } catch (Exception e) {
            }

        }

    }

    public Ozgur(){
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500 , 500 );
    }
    public static void main(String[] args) {
       Ozgur oz1 = new Ozgur();
       Thread t1 = new Thread(oz1);
       t1.start();


    }
}
