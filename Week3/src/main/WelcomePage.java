package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage implements ActionListener {

        // Needed info for the program to start!!
        JButton btnStart ;
        boolean Tamam = false;
        JFrame frame = new JFrame();
        JTextField txtName, txtWeight, txtHeight , txtGender , txtAge;
        JLabel lblName, lblWeight, lblHeight , lblGender , lblAge;
        int age;
        double weight, Height;
        String Gender;



        /**
         * Wlecome PAge with the frame and all the needed buttons and labels in the app
         */
        public WelcomePage() {

        }


    /**
     * calling Start method to draw the frame and set the lbls ans txts on it
     */
    public void START(){
            //cdefining the texts and the labels
            txtAge = new JTextField();
            txtGender = new JTextField();
            txtHeight = new JTextField();
            txtWeight = new JTextField();
            txtName = new JTextField();
            lblName = new JLabel("Name:"  );
            lblAge = new JLabel("Age:" );
            lblHeight = new JLabel("Height:");
            lblWeight = new JLabel("Weight:");
            lblGender = new JLabel("Gender:");
            btnStart = new JButton("Start");

            //setting the font
            Font f = new Font("f",Font.BOLD  | Font.ITALIC , 30);
            btnStart.setFont(f);
            lblGender.setFont(f);
            lblAge.setFont(f);
            lblHeight.setFont(f);
            lblWeight.setFont(f);
            lblName.setFont(f);

            //setting the size
            txtGender.setSize(130,130);
            txtHeight.setSize(30,10);
            txtWeight.setSize(30,10);
            txtName.setSize(30,10);
            txtAge.setSize(30,10);


            btnStart.addActionListener(this);



            //adding the frame
            frame.add(lblName);
            frame.add(txtName);
            frame.add(lblAge);
            frame.add(txtAge);
            frame.add(lblHeight);
            frame.add(txtHeight);
            frame.add(lblWeight);
            frame.add(txtWeight);
            frame.add(lblGender);
            frame.add(txtGender);
            frame.add(btnStart);


            // Set the layout
            frame.setLayout(new GridLayout(6,2));
            frame.setVisible(true);
            frame.setSize(800 , 800); // SEt the size
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }




    double cal;
    String BmiType ;
        /**
         * Action Listenr for the Buttons
         * @param
         */
        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource() == btnStart){
                Gender = txtGender.getText();
                weight = Double.parseDouble(txtWeight.getText());
                Height = Double.parseDouble(txtHeight.getText());
                age = Integer.parseInt(txtAge.getText());
                cal = (weight / Math.pow(Height, 2));


                    checkBMI();
                    if((Gender.equalsIgnoreCase("MALE") || Gender.equalsIgnoreCase("FEMALE")
                    ) && (age > 18 && age < 80))
                        Tamam = true;
                      else {
                        Tamam = false;
                        JOptionPane.showMessageDialog(frame, "Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                if(Tamam){
                levelPage lvlPage = new levelPage(cal , BmiType );
                lvlPage.START();
                System.out.println(weight + " " + Height);
                frame.dispose();}

            }
        }



        public void checkBMI(){
            if(cal < 18.5){
                BmiType = "Underweight";
            }
            else if(cal >= 18.5 && cal < 25){
                BmiType = "Normal Weight";
            }
            else if(cal >= 25 && cal < 30) {
                BmiType = "Overweight";
            }
            else
                BmiType = "obesity";

        }
}
