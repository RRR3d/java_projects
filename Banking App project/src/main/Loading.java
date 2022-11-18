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
            "/Users/abdo/Documents/GitHub/java_projects/Banking App project/src/main/HSBC_NEWLOGO(2).jpg");
    JLabel lblIcone = new JLabel();
    JLabel lblBank = new JLabel("MIB");
    JLabel lblBgImage = new JLabel();
    ImageIcon BgImage =new ImageIcon(
            "/Users/abdo/Documents/GitHub/java_projects/Banking App project/src/main/RedLION_wallpaper(2).jpg");

    /**
     *Put every Animation in its place
     */
    int x1 = 410;
    int x2 = 405;
    int x3 = 408;
    int x4 = 415;
    int Xs1 = 9;
    int Xs2 = 8;
    int Xs3 = 6;
    int Xs4 = 7;
    String H = "H";
    String S = "S";
    String B = "B";
    String C = "C";
    JLabel lbl1 = new JLabel("C");
    int xSH =13;
    int xSS = 14;
    int xSB = 12;
    int xSC = 15;
    int xH, xS,xB,xC , Y;
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

        if (xH <= 600 )
            xH += xSH;
        if(xS <= 620)
            xS += xSS;
        if(xB <= 640)
            xB += xSB;
        if(xC <= 660 )
            xC += xSC;

        if(x1 >=  800 ||   x1 < 200){
            Xs1 *= -1;}
        x1 += Xs1;
        if(x2 >=  800 ||   x2 < 200){
            Xs2 *= -1;}
        x2 += Xs2  ;
        if(x3 >=  800 ||   x3 < 200){
            Xs3 *= -1;}
        x3 += Xs3 ;
        if(x4 >=  800 ||   x4 < 200){
            Xs4 *= -1;}
        x4 += Xs4 ;
        repaint();

    }

    /**
     * Set the constructor and the lables of the panel
     */
    public Loading() {
        xH = 100;
        xS = 300 ;
        xB = 400;
        xC = 200;
        Y = 600;
        JFrame frame = new JFrame();
        frame.add(this);
        //setBackground(Color.GRAY);
        frame.setSize(1400,1000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);
        setSize(1400,1000);
        setVisible(true);
        lblLoading = new JLabel("Loading...");
        lblLoading.setFont(new Font( "", Font.BOLD | Font.ITALIC , 30));
        lblLoading.setForeground(Color.RED);
        lblLoading.setBounds(600 , 200 , 200 , 200);
        //add(lblLoading);
        //timer = new Timer(50 ,this);
        //timer.start();
//        c1 = new LoadingCircles(150,200 , 5 , 0 , Color.darkGray);
//        c2 = new LoadingCircles(140 , 200 ,5 , 0 , Color.GRAY);
//        c3 = new LoadingCircles(130 ,200 ,5 , 0 , Color.LIGHT_GRAY);
//        c4 = new LoadingCircles(160 , 200 ,5 , 0 ,Color.BLACK);


        // LBL AND ICONE SETT
        lblBank.setFont(new Font("BANK", Font.BOLD, 30));
        lblBank.setBounds(625, 125, 100, 100);
        lblIcone.setIcon(banklogo1);
        lblIcone.setBounds(600, 50, 300, 150);

        lblBgImage.setBounds(0,-200,1400 ,1000);
        lblBgImage.setIcon(BgImage);

        // add(lblBgimage);
       // add(lblBank);
        add(lblIcone);

        add(lblBgImage);

        Thread th = new Thread(this);
        th.start();
        /**
         * This is a counter for 20s to close the loading page after it
         */
        for(int i = 0 ; i < 30 ; i++){
            try{
                Thread.sleep(100);
                if(i == 29){
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
        g.setColor(Color.RED);
        g.fillOval(x1 , 210 , 25 , 25);
        g.fillOval(x2 , 210 , 20 , 20);
        g.fillOval(x3 , 210 , 15 , 15);
        g.fillOval(x4  ,210, 10 , 10);


        g.setFont(new Font(null , Font.ITALIC , 100));

        g.drawString(H , xH ,Y  );
        g.drawString(B , xB ,Y  );

        g.setColor(Color.white);
        g.drawString(S , xS ,Y  );
        g.drawString(C , xC ,Y  );

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