package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class panel extends JPanel  implements ActionListener {
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




    // ***************************************************************************************************


    // ***************************************************************************************************


    /*
    The Constructor takes 4 threads for each circle  and the dimensions for the panel
     */
    panel(Thread th1 , Thread th2 , Thread th3 , Thread th4){
        this.setPreferredSize(new Dimension(panel_W , panel_H));
        this.setBackground(Color.RED);
        timer = new Timer(10 , this);
        timer.start();
        this.th1 =th1;
        this.th2 = th2;
        this.th3 = th3 ;
        this.th4 = th4;
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
        if(th1.getName().equals( "th1")){
        if(x >= panel_W  - 100  ||   x < 0){
            xVelocity *= -1;}
        x += xVelocity;}

        // *****************************************

        if(th2.getName().equals( "th2")){
            if(x2 >= panel_W  - 100  ||   x2 < 0){
                x2Velocity *= -1;}
            x2 += x2Velocity;}
        // *****************************************

        if(th3.getName().equals( "th3")){
            if(y3 >= panel_H - 100  ||   y3 < 0){
                y3Velocity *= -1; }
            y3 +=  y3Velocity;}
        // *****************************************

        if(th4.getName().equals( "th4")){
            if(y4 >= panel_H - 100  ||   y4 < 0){
                y4Velocity *= -1;}
            y4 +=  y4Velocity;}
        // *****************************************

        // Repaint to move the circles
        repaint();
    }
}
