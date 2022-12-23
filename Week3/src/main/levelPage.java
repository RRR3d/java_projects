package main;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class levelPage implements ActionListener {
    //needed info
    JButton btnHard, btnMedium, btnEasy;
    JLabel lblBmi, lblLevel;

    //define the frame
    JFrame frame = new JFrame();
    double BMI;
    String BmiType;


    /**
     * Constructor that takes BMI as a double and the type of the body
     * @param BMI
     * @param Type
     */
    public levelPage(double BMI , String Type  ){this.BMI = BMI;this.BmiType = Type;

    }

    /**
     * setting the font and defining the labels and the buttons
     */
    public void START(){

        Font f = new Font("f",Font.BOLD  | Font.ITALIC , 25);


        lblBmi = new JLabel("your BMI is: " +" "+ BMI  + " " + BmiType   );
        lblLevel = new JLabel("Choose the level you want to start with:");
        btnEasy = new JButton("Easy");
        btnMedium = new JButton("Medium");
        btnHard = new JButton("Hard");

        //setting fomt
        btnMedium.setFont(f);
        btnHard.setFont(f);
        btnEasy.setFont(f);
        lblLevel.setFont(f);
        lblBmi.setFont(f);


        //adding actionlistener and frame
        btnEasy.addActionListener(this);
        btnMedium.addActionListener(this);
        btnHard.addActionListener(this);

        frame.add(lblBmi);
        frame.add(lblLevel);
        frame.add(btnEasy);
        frame.add(btnMedium);
        frame.add(btnHard);

        //designing the frame
        frame.setLayout(new GridLayout(5,1));
        frame.setVisible(true);
        frame.setSize(700 , 700); // SEt the size
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /**
     * if the user clicks on the buttons, the method plan() will work
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnEasy) {
            frame.dispose();
            new plan();

        } else if (e.getSource() == btnHard) {
            frame.dispose();
            new plan();
        } else if (e.getSource() == btnMedium) {
            frame.dispose();
            new plan();
        }


    }

}
