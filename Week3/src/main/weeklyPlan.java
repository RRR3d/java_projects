package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class weeklyPlan implements ActionListener, Runnable {
    //needed info
    JButton btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight;
    JFrame frame = new JFrame();
    Font f = new Font("f",Font.BOLD  | Font.ITALIC , 25);

    /**
     * define buttons
     */
    public weeklyPlan(){
        btnOne = new JButton(" Day 1");
        btnTwo = new JButton("Day 2");
        btnThree = new JButton("Day 3");
        btnFour = new JButton("Day 4");
        btnFive = new JButton("Day 5");
        btnSix = new JButton("Day 6");
        btnSeven = new JButton("Day 7");
        btnEight = new JButton("Day 8");


        //set font
        btnOne.setFont(f);
        btnTwo.setFont(f);
        btnThree.setFont(f);
        btnFour.setFont(f);
        btnFive.setFont(f);
        btnSix.setFont(f);
        btnSeven.setFont(f);
        btnEight.setFont(f);

        //add actionlistener
        btnOne.addActionListener(this);
        btnTwo.addActionListener(this);
        btnThree.addActionListener(this);
        btnFour.addActionListener(this);
        btnFive.addActionListener(this);
        btnSix.addActionListener(this);
        btnSeven.addActionListener(this);
        btnEight.addActionListener(this);

        //add frame
        frame.add(btnOne);
        frame.add(btnTwo);
        frame.add(btnThree);
        frame.add(btnFour);
        frame.add(btnFive);
        frame.add(btnSix);
        frame.add(btnSeven);
        frame.add(btnEight);


        //design frame
        frame.setLayout(new GridLayout(2,4));
        frame.setVisible(true);
        frame.setSize(600 , 600); // SEt the size
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);




    }


    @Override
    public void actionPerformed(ActionEvent e) {}

    @Override
    public void run() {

    }
       /* frame.dispose();
        if (e.getSource() == btnOne) {
            new weeklyPlan();
        }
        if (e.getSource() == btnTwo) {
            new ();
        }
        if (e.getSource() == btnThree) {
            new ();
        }
        if (e.getSource() == btnFour) {
            new ();
        }
        if (e.getSource() == btnFive) {
            new ();
        }
        if (e.getSource() == btnSix) {
            new ();
        }
        if (e.getSource() == btnSeven) {
            new ();
        }
    }*/
}
