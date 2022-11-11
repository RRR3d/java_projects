package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Circle extends JFrame implements ActionListener {
    private int x,y, V , xVelocity , yVelocity;
    private Color color;
    Timer timer = new Timer(5 , this);
    /**
     * 
     * @param x
     * @param y
     * @param V
     * @param c
     */
    public Circle(int x, int y, int V, Color c){
    this.x=x;
    this.y=y;
    this.V= V;
    this.color=c;
    xVelocity =5;
    yVelocity = 5;
}    
 
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getV(){
        return V;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public void setV(int V){
        this.V=V;
    }
    public Color getColor(){
        return color;
    }
    /**
     * Method for making circles move 
     */
    public void actionPreformed(){



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(x >=  400  ||   x < 0){
            xVelocity *= -1;
            x += xVelocity;}

        if(y >= 400  ||   y < 0){
            yVelocity *= -1;
            y +=  yVelocity;}

        timer.start();
        repaint();
    }
}