package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome_Page implements ActionListener {

    // Needed info for the program to start!!
     JButton btnStart ;
     JLabel lblName, lblWeight, lblHeight , lblGender , lblAge;
     int Age;
     double weight, Height;
     String Name , Gender;

    /**
     * Wlecome PAge with the frame and all the needed buttons and labels in the app
     */
    public Welcome_Page() {
        getData();
        JFrame frame = new JFrame();
        btnStart = new JButton("Start");
        lblName = new JLabel("Hello, " + Name );
        lblAge = new JLabel("Age: " + Age);
        lblHeight = new JLabel("Height: " + Height);
        lblWeight = new JLabel("Weight: " + weight);
        lblGender = new JLabel("Gender: " + Gender);

        btnStart.addActionListener(this);


        frame.add(btnStart);
        frame.add(lblName);
        frame.add(lblAge);
        frame.add(lblHeight);
        frame.add(lblWeight);
        frame.add(lblGender);


        // Set the layout
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setSize(400 , 400); // SEt the size
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



    }


    /**
     * GEt the data from the user
     */
    public void getData(){
        try {
            Name = JOptionPane.showInputDialog(null, "PLease enter your Name: ");
            weight = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter your Weight  "));
            Height = Double.parseDouble(JOptionPane.showInputDialog(null, "PLease enter your Height: "));
            Age = Integer.parseInt(JOptionPane.showInputDialog(null, "PLease enter your Age: "));
            Gender = JOptionPane.showInputDialog(null, "PLease enter your Gender: ");

            // Check if there is an error!!
        }catch (Exception e ){
            JOptionPane.showMessageDialog(null , "Please check your info!!");}
    }


    /**
     * Action Listenr for the Buttons
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == btnStart){

        bmi();
        }
    }



    // Calculate the BMI
    public double bmi(){
        return 3.23;
    }

}
