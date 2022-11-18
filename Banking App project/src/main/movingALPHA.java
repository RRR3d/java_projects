package main;

import javax.swing.*;
import java.awt.*;

public class movingALPHA extends JPanel  implements Runnable{
    String H = "H";
    String S = "S";
    String B = "B";
    String C = "C";
    JLabel lbl1 = new JLabel("C");
    int xSH =5;
    int xSS = 5;
    int xSB = 5;
    int xSC = 5;
    int xH, xS,xB,xC , Y;
    JFrame frame;


    public movingALPHA(){
        xH = 100;
        xS = 200 ;
        xB = 300;
        xC = 400;
        Y = 300;
        frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(1400 ,1000);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        add(lbl1);
        setSize(frame.getSize());
        setVisible(true);
        setLayout(null);


        Thread th = new Thread(this);
        th.start();


        frame.add(this);
    }

    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.RED);
        g.setFont(new Font(null , Font.ITALIC , 100));
        g.drawString("H" , xH , Y);
        g.drawString(H , xH ,Y  );
        g.drawString(S , xS ,Y  );
        g.drawString(B , xB ,Y  );
        g.drawString(C , xC ,Y  );
    }
    public static void main(String[] args) {
        new movingALPHA();
    }
    /**
     * if(x1 >=  800 ||   x1 < 200){
     *             Xs1 *= -1;}
     *         x1 += Xs1;
     */
    public void move(){
        if(xH == 800 || xH < 200 )
            xH *= -1;
        xH += xSH;
        if(xS >= 800 || xS < 200 )
            xS *= -1;
        xS += xSS;
        if(xB>= 800 || xB < 200 )
            xB *= -1;
        xB += xSB;
        if(xC >= 800 || xC < 200 )
            xC *= -1;
        xC += xSC;
    }
    public void run(){
        try{
            Thread.sleep(50);
            move();
        }catch(Exception e){}
    }

}
