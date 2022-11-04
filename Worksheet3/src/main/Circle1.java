package main;
/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Circle1 extends JPanel  implements ActionListener {
    int x = 500;
    int y = 500;
    int xVelocity = 8;
    int yVelocity = 5;
    Timer timer;
    public Circle1(){
        this.setPreferredSize(new Dimension(500 , 500));
        this.setBackground(Color.RED);
        timer = new Timer(10 , this);
        timer.start();
    }
    public void paint(Graphics g){
        super.paint(g); // paint background
        Graphics2D g2D =  (Graphics2D) g;
        g2D.fillOval(x+ 250 ,y +250, 50 , 50 );
        g2D.setColor(Color.GREEN);

    }




    @Override
    public void actionPerformed(ActionEvent e) {
        if(x >= 500  - 100  ||   x < 0)
            xVelocity *= -1;
        x += xVelocity;

        if(y >= 500 - 100  ||   y < 0)
            yVelocity *= -1;
        y +=  yVelocity;
        repaint();

    }
}
*/