package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myGame extends JPanel implements ActionListener {
    private JButton btnMove ,btnStop;
    private Font f ;
    private int x,y;
    private Timer timer ;

    public void paint (Graphics g){
        super.paint(g);
        g.setFont(f);
        g.setColor(Color.red);
        g.drawString("CMPE " , x , y);

        /*
        g.setColor(Color.GREEN);
        g.drawLine( 50 ,50 ,350 , 300);
        g.setColor(Color.BLUE);
        g.drawRect(100 , 50 , 200 , 150);
        g.setColor(Color.pink);
        g.drawOval(x , y , 300 , 300);
        g.drawOval(200 ,250 , 200 ,100);
        g.fillOval(300 , 250 , 100,100);
        g.setColor(Color.BLACK);
        g.fillRect(50 , 250 , 200 ,100);

         */
    }

   public myGame(){
        x = 200;
        y = 100;

       setLayout(new BorderLayout());
       btnMove = new JButton("MOVE");
       btnMove.addActionListener(this);
       add(btnMove , BorderLayout.NORTH);

       btnStop = new JButton("STOP");
       add(btnStop , BorderLayout.SOUTH);
       btnStop.addActionListener(this);
        f = new Font("Time New Roman" , Font.BOLD | Font.ITALIC ,35);
       setSize(800, 600);
       setVisible(true);

       timer = new Timer(200 , this);
      // timer.start();



   }

    public static void main(String[] args) {
        myGame m = new myGame();
        // display the object
        JFrame window = new JFrame();
        window.setTitle("My Game");
        window.setSize(m.getSize());
        window.setVisible(true);
        window.add(m); // add the panel content on the window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == timer)
        {
            x += 5;
            y += 5;
            repaint();
        }
        else if (e.getSource() == btnMove){
            timer.start();
        }
        else if(e.getSource() == btnStop){
            timer.stop();
        }

    }
}
