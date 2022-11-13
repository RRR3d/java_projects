package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Loading extends JPanel implements ActionListener, Runnable {
    int speedx =5;
    Timer timer = new Timer(200,this);
    JLabel lblLoading;


    /**
     * intialize the loc
     */
    int y = 150;
    int x =200 ;


    public void paint(Graphics g){
        super.paint(g);
        g.fillOval(x , y , 50 , 50);
        g.setColor(Color.black);


    }
    public void Move(){
        // x = x + speedx;
        if(x >=  200 ||   x < 100){
            speedx *= -1;}
        x += speedx;
        repaint();

    }
    public Loading() {
        setLayout(null);
        setSize(400,400);
        setVisible(true);
        lblLoading = new JLabel("Loading...");
        lblLoading.setFont(new Font( "", Font.BOLD , 25));
        lblLoading.setBounds(120 , 150 , 200 , 200);
        add(lblLoading);
        timer = new Timer(50 ,this);
        timer.start();
        // TODO Auto-generated constructor stub


    }
    public static void main(String[] args) {

        JFrame MyWindow = new JFrame();
        Loading loading = new Loading();
        MyWindow.add(loading);

        MyWindow.setSize(400,400);
        MyWindow.setVisible(true);
        MyWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Thread th = new Thread(loading);
        th.start();


    }


    @Override
    public void actionPerformed(ActionEvent e) {
       // if (e.getSource() == timer){


        //repaint();

    }

    @Override
    public void run() {
        try {
            for (; ; ){
                Move();
            Thread.sleep(50);}
        }catch(Exception e){}
    }
}