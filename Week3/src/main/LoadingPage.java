package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LoadingPage extends JPanel implements ActionListener,Runnable {
    //intialize necessary info
    int speedx = 5;
   // Timer timer;
    JLabel lblLoading;
    JFrame myWindow = new JFrame();

    /**
     * intialize the loc
     */
    int y = 150;
    int x =200 ;


    /**
     * setting the circle
     * @param g
     */
    public void paint(Graphics g){
        super.paint(g);
        g.fillOval(x , y , 45 , 45);
        g.setColor(Color.black);


    }

    /**
     * the method that makes the ball move between specific locations
     */
    public void Move(){
        if(x >=  200 ||   x < 100){
            speedx *= -1;
        }
        x += speedx;
        repaint();

    }

    /**
     * the design and the sizes
     */
    public LoadingPage() {


        setLayout(null);
        setSize(400,400);
        setVisible(true);
        lblLoading = new JLabel("Loading...");
        lblLoading.setFont(new Font( "", Font.BOLD , 20));
        lblLoading.setBounds(130 , 140 , 200 , 200);
        add(lblLoading);

        // THE JFRAME

        myWindow.setSize(this.getSize());
        myWindow.setVisible(true);
        myWindow.add(this);
        myWindow.setLayout(null);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Creat a thread and Start it
        Thread myThread = new Thread(this);
        myThread.start();
        for(int i = 0 ; i < 20 ; i++){
            try{
                Thread.sleep(100);
                if(i == 19 ){
                    myWindow.dispose();
                }
            }catch(Exception e){
                System.out.println(e);}}

        // TODO Auto-generated constructor stub

/*


 */

    }




    /**\TEST
     * @param args
     */
    public static void main(String[] args) {
    new LoadingPage();

    }


    @Override
    public void actionPerformed(ActionEvent e) {


    }

    /**
     * run MEthod to test the Thread and use it
     */
    @Override
    public void run() {
        try {
            while(true){
                Move();
                Thread.sleep(50);

                }
            } catch (InterruptedException ex) {
            ex.printStackTrace();
        }


    }
}
