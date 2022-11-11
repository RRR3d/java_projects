package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame  implements Runnable , ActionListener  {

    /*
int x =0 ;
int y = 0;
//**********
int x2 =0 ;
int y2= 400;
//**********
int x3 =0;
int y3 = 400;
//**********
int x4 =400 ;
int y4 = 400;
 */

    Circle c1,c2,c3,c4;
    public Main(){
        // CREATE the Circles and set the Size and places of them.
         c1 = new Circle(0 , 0 , 100 , Color.GREEN);
         c2 = new Circle(0 , 400 , 100 , Color.RED);
         c3 = new Circle(400 , 0 , 100 , Color.BLUE);
         c4 = new Circle(400 , 400 , 100 , Color.PINK);
        Timer timer = new Timer(10 , this);
        Thread MyThread ;

        this.setBackground(Color.RED);
        this.setLayout(new BorderLayout());
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        MyThread = new Thread(this);
        timer.start();
        MyThread.start();

    }
    public static void main(String[] args)  {
/*
        Main m = new Main();
        m.run();

 */






       // Create 4 threads for each ball

        panel p1 = new panel();
        panel p2 = new panel();
        panel p3 = new panel();
        panel p4 = new panel();

       Thread th1 = new Thread(p1);
        Thread th2= new Thread(p2);
        Thread th4 = new Thread(p3);
        Thread th3 = new Thread(p4);

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

        System.out.println(Thread.activeCount());
        System.out.println(Thread.activeCount());
        System.out.println(Thread.activeCount());
     // Create the FRAME to set the panel on it
        JFrame frame = new JFrame();



        // set the 4 threads for the balls to move in
        panel panel = new panel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);





    }


    public void paint(Graphics g){
        super.paint(g);
        g.setColor(c1.getColor());
        g.fillOval(c1.getX(),c1.getY(),c1.getV(),c1.getV());
        g.setColor(c2.getColor());
        g.fillOval(c2.getX(),c2.getY(),c2.getV(),c2.getV());
        g.setColor(c3.getColor());
        g.fillOval(c3.getX(),c3.getY(),c3.getV(),c3.getV());
        g.setColor(c4.getColor());
        g.fillOval(c4.getX(),c4.getY(),c4.getV(),c4.getV());
    }

    @Override
    public void run() {

        try {
            Thread.currentThread().sleep(10);
            c1.actionPreformed();
            c2.actionPreformed();
            c3.actionPreformed();
            c4.actionPreformed();
            repaint();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

       // repaint();
    }
}
