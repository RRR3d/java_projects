package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class panel extends JPanel  implements ActionListener , Runnable {
    final int panel_W = 500 ;
    final int panel_H = 500;
    Timer timer;
    // Create 4 threads for each circle
    Thread th1 ,th2 , th3 ,th4;
    int xVelocity =5;
//    int yVelocity = 5 ;
    int x2Velocity =5;
//    int y2Velocity = 5 ;
//    int x3Velocity =5;
    int y3Velocity =5 ;
//    int x4Velocity =5;
    int y4Velocity = 5 ;

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

int xAxis,yAxis , Radius ;
Color color;



    // ***************************************************************************************************


    // ***************************************************************************************************


    /*
    The Constructor takes 4 threads for each circle  and the dimensions for the panel
     */
    panel(){
        this.th = th;

        this.x = xAxis;
        this.y = yAxis;
       // this.R = Radius;

        this.setPreferredSize(new Dimension(panel_W , panel_H));
        this.setBackground(Color.RED);
        timer = new Timer(10 , this);
        timer.start();

    }

    /*
    Paint method to draw the circles and paint it
     */
    public void paint(Graphics g){
        super.paint(g); // paint background
        g.fillOval(x , y , 100 , 100);
        g.setColor(Color.BLUE);
        g.fillOval(x2, y2  , 100 , 100 );

        g.setColor(Color.GREEN);
        g.fillOval(x3 , y3 , 100 ,100);

        g.setColor(Color.pink);
        g.fillOval(x4 , y4 , 100 ,100);
        g.setColor(Color.black);
    }

    /*
    Action Event to be able to animate the circles
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        if(x >= panel_W  - 100  ||   x < 0){
            xVelocity *= -1;}
        x += xVelocity;

        // *****************************************


            if(x2 >= panel_W  - 100  ||   x2 < 0){
                x2Velocity *= -1;}
            x2 += x2Velocity;
        // *****************************************


            if(y3 >= panel_H - 100  ||   y3 < 0){
                y3Velocity *= -1; }
            y3 +=  y3Velocity;
        // *****************************************


            if(y4 >= panel_H - 100  ||   y4 < 0){
                y4Velocity *= -1;}
            y4 +=  y4Velocity;
        // *****************************************

        // Repaint to move the circles
        repaint();
    }

    Thread th;
    @Override
    public void run() {



    }
}
