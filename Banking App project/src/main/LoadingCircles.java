package main;

import java.awt.*;

public class LoadingCircles {
    int x , y , xS ,yS ;
    Color color;

    /**
     * ADd x y and other parramerters needed to the constracor needed for the app to start
     * @param x
     * @param y
     * @param xS
     * @param yS
     * @param color
     */
    public LoadingCircles(int x , int y, int xS , int yS , Color color){
        this.x = x ;
        this.y = y;
        this.xS = xS;
        this.yS = yS;
        this.color = color;
    }

    /**
     * SETTERS AND GETTERS
     * @return
     */
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getxS() {
        return xS;
    }

    public void setxS(int xS) {
        this.xS = xS;
    }

    public int getyS() {
        return yS;
    }

    public void setyS(int yS) {
        this.yS = yS;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
