package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class threadTest extends JPanel implements ActionListener, Runnable{
    JFrame jFrame;
    Timer timer;
    public threadTest(){
         jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setSize(500 , 500);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.add(this);
        setSize(jFrame.getSize());
        setVisible(true);
        timer = new Timer(100 , this);
        timer.start();
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        g.fillOval(x,y, 100 ,100 );
        g.setColor(Color.GREEN);
        g.fillOval(x,y, 100 ,100 );
        g.setColor(Color.BLUE);
        g.fillOval(x,y, 100 ,100 );
        g.setColor(Color.CYAN);
        g.fillOval(x,y, 100 ,100 );

    }
    int x = 1;
    int y = 1;
    int xv = 10;
    int yv = 10;

    public void move(){

            if (x >= 500 || x <= 0) {
                xv *= -1;
            }
            x += xv;
            if (y >= 500 || y <= 0) {
                yv *= -1;
            }
            y += yv;
            repaint();



    }

    @Override
    public void run() {
        while(true){
        try{
        Thread.sleep(50);
        move();
        //Thread.sleep(100);
       //repaint();
    }catch (Exception e){
            System.out.println(e);
        }}
    }

    public void print10(){
        for(int i = 0 ; i < 100 ; i++)
            System.out.println(i);
    }

    public static void main(String[] args) {
        threadTest th = new threadTest();
        Thread th1 = new Thread(th);

        th1.start();



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == timer){
              //  move();
            //repaint();
        }
    }
}
