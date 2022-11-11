package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class circleOZGUR extends JFrame  {
    Timer timer;
    int x , y , r;
    int v = 5;

    public circleOZGUR(int x, int y, int r) throws HeadlessException {
        this.x = x;
        this.y = y;
        this.r = r;
        v = 5;

      //  this.pack();
       // timer = new Timer(5 ,this);
    }



    @Override
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }




}
