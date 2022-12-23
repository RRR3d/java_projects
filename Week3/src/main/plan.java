package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class plan  implements ActionListener {
    //defining some info and font
    JButton btnLegs, btnArms, btnAbs, btnFullBody;
    JLabel lblPlan;
    JFrame frame = new JFrame();
    Font f = new Font("f",Font.BOLD  | Font.ITALIC , 25);

    /**
     * defining labels and buttons
     */
    public plan(){

        lblPlan = new JLabel("Choose your workout plan: ");
        btnLegs = new JButton("Legs Workout");
        btnArms = new JButton("Arms Workout");
        btnAbs = new JButton("Abs Workout");
        btnFullBody = new JButton("Full Body Workout");

        //setting font
        btnAbs.setFont(f);
        btnArms.setFont(f);
        btnLegs.setFont(f);
        lblPlan.setFont(f);
        btnFullBody.setFont(f);

        //adding actionlistener
        btnArms.addActionListener(this);
        btnLegs.addActionListener(this);
        btnAbs.addActionListener(this);
        btnFullBody.addActionListener(this);

        //adding frame
        frame.add(lblPlan);
        frame.add(btnArms);
        frame.add(btnLegs);
        frame.add(btnAbs);
        frame.add(btnFullBody);

        //designing the frame
        frame.setLayout(new GridLayout(5,1));
        frame.setVisible(true);
        frame.setSize(500 , 500); // SEt the size
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }


    /**
     * if the user clicks on the buttons weekly plan() and loadinpage () will work
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnAbs){
            frame.dispose();
            new LoadingPage();
            new weeklyPlan();
        }
        else if(e.getSource() == btnArms){
            frame.dispose();
            new LoadingPage();
            new weeklyPlan();
        }
        else if(e.getSource() == btnLegs){
            frame.dispose();
            new LoadingPage();
            new weeklyPlan();
        }
        else if(e.getSource() == btnFullBody){
            frame.dispose();
            new LoadingPage();
            new weeklyPlan();
        }

    }
}
