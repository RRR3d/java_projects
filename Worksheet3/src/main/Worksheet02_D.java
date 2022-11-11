package main;

import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;


class Worksheet02_D extends JFrame implements Runnable{
    //Declaring of attributes
    private Thread myThread;
    private Circle Circle1,Circle2,Circle3,Circle4;
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Circle1.getColor());
        g.fillOval(Circle1.getX(),Circle1.getY(),Circle1.getV(),Circle1.getV());
        g.setColor(Circle2.getColor());
        g.fillOval(Circle2.getX(),Circle2.getY(),Circle2.getV(),Circle2.getV());
        g.setColor(Circle3.getColor());
        g.fillOval(Circle3.getX(),Circle3.getY(),Circle3.getV(),Circle3.getV());
        g.setColor(Circle4.getColor());
        g.fillOval(Circle4.getX(),Circle4.getY(),Circle4.getV(),Circle4.getV());
    }
    
    public Worksheet02_D(){
        setLayout(new BorderLayout());
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        
        Circle1 = new Circle(100, 100, 50,Color.BLUE);
        Circle2 = new Circle(100, 650, 50,Color.CYAN);
        Circle3 = new Circle(650,650, 50,Color.GREEN);
        Circle4 = new Circle(650, 100, 50,Color.RED);
        getContentPane().setBackground(Color.RED);
        myThread= new Thread(this);
		myThread.start();


    }
    public static void main(String[] args) {
        new Worksheet02_D();
    }

    

    public void run() {
        
        while(true) {
			try {
				Thread.currentThread().sleep(10);
				Circle1.actionPreformed();
                Circle2.actionPreformed();
                Circle3.actionPreformed();
                Circle4.actionPreformed();
                repaint();
			}
			catch ( InterruptedException e) {
				
				System.out.println(e.getMessage());
			}
		}
    }

    
}
