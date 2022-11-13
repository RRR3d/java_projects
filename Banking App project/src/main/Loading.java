package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Loading extends JPanel implements Runnable {
    int speedx =5;  //intial speed for the project
   //Timer timer = new Timer(200,this);
    JLabel lblLoading;
    ImageIcon banklogo1 = new ImageIcon(
            "/Users/abdo/Documents/GitHub/java_projects/Banking App project/src/main/Banking App project.png");
    JLabel lblIcone = new JLabel();
    JLabel lblBank = new JLabel("MIB");

   // LoadingCircles c1,c2,c3,c4;
    /**
     *Put every Circle in its place
     */
    int x1 = 300;
    int x2 = 300;
    int x3 = 300;
    int x4 = 300;


    /**
     * Let the circles move and control their movement
     */
    public void Move(){
        // x = x + speedx;

        /*
        if(x >= panel_W  - 100  ||   x < 0){
            xVelocity *= -1;}
        x += xVelocity;
         */
        if(x1 >=  450 ||   x1 < 200){
            speedx *= -1;}
        x1 += speedx +1;
        if(x2 >=  450 ||   x2 < 200){
            speedx *= -1;}
        x2 += speedx  ;
        if(x3 >=  450 ||   x3 < 200){
            speedx *= -1;}
        x3 += speedx ;
        if(x4 >=  450 ||   x4 < 200){
            speedx *= -1;}
        x4 += speedx ;
        repaint();

    }

    /**
     * Set the constructor and the lables of the panel
     */
    public Loading() {

        JFrame frame = new JFrame();
        frame.add(this);
        setBackground(Color.GRAY);
        frame.setSize(600,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);
        setSize(600,600);
        setVisible(true);
        lblLoading = new JLabel("Loading..");
        lblLoading.setFont(new Font( "", Font.BOLD , 25));
        lblLoading.setBounds(120 , 150 , 200 , 200);
        add(lblLoading);
        //timer = new Timer(50 ,this);
        //timer.start();
//        c1 = new LoadingCircles(150,200 , 5 , 0 , Color.darkGray);
//        c2 = new LoadingCircles(140 , 200 ,5 , 0 , Color.GRAY);
//        c3 = new LoadingCircles(130 ,200 ,5 , 0 , Color.LIGHT_GRAY);
//        c4 = new LoadingCircles(160 , 200 ,5 , 0 ,Color.BLACK);


        // LBL AND ICONE SETT
        lblBank.setFont(new Font("BANK", Font.BOLD, 30));
        lblBank.setBounds(250, 125, 100, 100);
        lblIcone.setIcon(banklogo1);
        lblIcone.setBounds(225, 50, 150, 100);



        add(lblBank);
        add(lblIcone);


        Thread th = new Thread(this);
        th.start();
        /**
         * This is a counter for 20s to close the loading page after it
         */
        for(int i = 0 ; i < 40 ; i++){
            try{
                Thread.sleep(100);
                if(i == 39){
                    frame.dispose();
                   // System.exit(1);

                }
            }catch(Exception e){
                System.out.println(e);
            }
        }

    }



    /**
     * Paint and draw the circles
     * @param g
     */
    public void paint(Graphics g){
        super.paint(g);
        g.fillOval(x1 , 190 , 25 , 25);
        g.setColor(Color.black);
        g.fillOval(x2 , 190 , 20 , 20);
        g.setColor(Color.darkGray);
        g.fillOval(x3 , 190 , 15 , 15);
        g.setColor(Color.GRAY);
        g.fillOval(x4  ,190, 10 , 10);
        g.setColor(Color.LIGHT_GRAY);
    }

    /**
     * TEST
     * @param args
     */
    public static void main(String[] args) {
        new Loading();
    }


    /*
    @Override
    public void actionPerformed(ActionEvent e) {
        // if (e.getSource() == timer){


        //repaint();

    }

     */

    /**
     * The run method to run the class in different Thread..
     */
    @Override
    public void run() {
        try {
            for (; ; ){
                Move();
                Thread.sleep(50);}
        }catch(Exception e){}
    }
}