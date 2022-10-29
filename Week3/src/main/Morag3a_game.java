package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Morag3a_game extends JPanel implements ActionListener {
    private JButton btnStart , btnStop;
    private int x,y;
    private Font font;
    private Timer timer;

    public Morag3a_game(){
        setLayout(new BorderLayout());
         x  = 100;
         y = 100;
        btnStart = new JButton("START");
        btnStop = new JButton("STOP");
        timer = new Timer(200 , this);
        font = new Font("KOKO" , Font.BOLD | Font.ITALIC , 40);
        add(btnStart , BorderLayout.NORTH);
        add(btnStop , BorderLayout.SOUTH);
        btnStop.addActionListener(this);
        btnStart.addActionListener(this);
        setVisible(true);

        setSize(500 ,500 );

    }

    public static void main(String[] args) {
         Morag3a_game m = new Morag3a_game();
        JFrame frame = new JFrame();
        frame.setSize(m.getSize());
        frame.setBackground(Color.green);
        frame.setVisible(true);
        frame.add(m);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }




    public void paint(Graphics e){
        super.paint(e);
        e.setFont(font);
        e.setColor(Color.BLACK);
        e.drawString("EL 5ANAZEEEER" , x , y);

    }




    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == timer){
            x += 10;
            y += 10;
            repaint();
        }
        else if (e.getSource()== btnStop){
            timer.stop();
        }
        else if (e.getSource() == btnStart)
            timer.start();
    }
}
