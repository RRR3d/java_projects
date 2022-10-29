package main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
public class Main  extends JFrame implements ActionListener {
    private JLabel lblName , lblAge;
    private JTextField txtName, txtAge;
    private JButton btnSubmit, btnReset;
    private JButton plus,minus,multi, divide;
    private JTextField num1,num2 ;
    private int n1,n2 , sum;

    public Main(){
        //BORDER LAYOUT
       // setLayout(new BorderLayout());
       // lblName = new JLabel("NAME");
        //  add(lblName , BorderLayout.NORTH);

        // FLOW LAYOUT

        // CALCULATOR
        JFrame frame = new JFrame();
        frame.setSize(300 , 300);
        frame.setBackground(Color.red);
        frame.setLayout(new FlowLayout());
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(200 ,200));
        panel.setBackground(Color.red);



        try {
            num1 = new JTextField("number");
            num2 = new JTextField("number");
            panel.add(num1);
            panel.add(num2);
            plus = new JButton("+");
            minus = new JButton("-");
            multi = new JButton("x");
            divide = new JButton("/");

            plus.addActionListener(this);
            minus.addActionListener(this);
            multi.addActionListener(this);
            divide.addActionListener(this);
            panel.add(plus);
            panel.add(minus);
            panel.add(multi);
            panel.add(divide);
            panel.setVisible(true);
            frame.add(panel);
            frame.setVisible(true);
        }catch (Exception e2) {
            System.out.println("e2");
        }




        /*
        setLayout(new FlowLayout());
        lblName = new JLabel("NAME");
        add(lblName);
        txtName = new JTextField("Enter your name!");
        add(txtName);
        txtName.setColumns(20);

        lblAge = new JLabel("AGE");
        add(lblAge);



        // GRID LAYOUT
        setLayout(new GridLayout(3,3));
        lblName = new JLabel("NAME");
        lblName.setForeground(Color.red);
        lblName.setBackground(Color.BLUE);
        add(lblName);

        txtName = new JTextField("Enter your name!");
        add(txtName);
        txtName.setColumns(5);

        lblAge = new JLabel("AGE");
        add(lblAge);

        txtAge = new JTextField("Enter your Age!");
        add(txtAge);
        txtAge.setColumns(5);

        btnReset = new JButton("Reset");
        add(btnReset);

        btnSubmit = new JButton("Submit");
        add(btnSubmit);



        getContentPane().setBackground(Color.cyan);
        setSize(300 , 400 );
        setVisible(true);
        setTitle("BILGI UNI");
        // setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Regestre the button
        btnSubmit.addActionListener(this );
        btnReset.addActionListener(this);

        */






    }
    public static void main(String[] args) {


         new Main();


/*
        JOptionPane.showMessageDialog(null , "Wellcome" ,
                "HELLO", JOptionPane.WARNING_MESSAGE);


        // Test The Confirmation dialog
        int c1 = JOptionPane.showConfirmDialog(null , "Wellcome" );
        if (c1 == 2)
            JOptionPane.showMessageDialog(null , "ERORR" , "cancel has been pressed",
                    JOptionPane.WARNING_MESSAGE);
        if (c1 ==1 )
            JOptionPane.showMessageDialog(null , "NO HAS BEEN PRESSED" , "YEss has been pressed",
                    JOptionPane.WARNING_MESSAGE);
        else if (c1 == 0 )
            JOptionPane.showMessageDialog(null , "yes Has been pressed" , "YES HAS BEEN PRESSED" ,
                    JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null , "You will be canceled", " MSG" ,
                JOptionPane.WARNING_MESSAGE);

        // TEST diff options
        int c2 = JOptionPane.showConfirmDialog(null , "error" , "MSG" ,
                JOptionPane.YES_NO_OPTION);



        // TEST OPTION DIALOG
        Object[] frends = {"Omar" , "Raghad" , "Dima" , "Abdul"};
        int f1 = 0;
        while (f1 != 3) {
            f1 = JOptionPane.showOptionDialog(null, "choose", "Choose a freind"
                    , JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, frends, frends[3]);
            if (f1 == 0)
                JOptionPane.showMessageDialog(null, "WRONG CHOICE", "ERROR"
                        , JOptionPane.WARNING_MESSAGE);
            if (f1 == 1)
                JOptionPane.showMessageDialog(null, "WRONG CHOICE", "ERROR",
                        JOptionPane.WARNING_MESSAGE);
            if (f1 == 2)
                JOptionPane.showMessageDialog(null, "WRONG CHOICE", "ERROR",
                        JOptionPane.WARNING_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, "NO ERROR", "GOOD JOB! "
                        , JOptionPane.WARNING_MESSAGE);
        }



        //Test INPUT DIALOG
        String SecretNumber = "2";

        String givenNumber = JOptionPane.showInputDialog(null , "choose a number " , "Guessing game"
        , JOptionPane.WARNING_MESSAGE);
        if (SecretNumber.equals(givenNumber) )
            JOptionPane.showMessageDialog(null , "Congrats You won", "Congrats",
                    JOptionPane.WARNING_MESSAGE);
        else
            JOptionPane.showMessageDialog(null , "WRONG YOU LOST" , "WRONG"
            , JOptionPane.WARNING_MESSAGE);


        // INPUT DIALOG OPTIONS
        Object[] friends = {"Omar" , "Dima" , "Raghad" , "Abdul"};
        String fr = (String)  JOptionPane.showInputDialog(null , "Choose a friend please", "CHOOSE",
                JOptionPane.WARNING_MESSAGE , null , friends , friends[3]);

        System.out.println(fr + " " );

        if (fr.equals("Abdul"))
            JOptionPane.showMessageDialog(null , "GOOD JOB FRIEND" , "GOOD"
            ,JOptionPane.WARNING_MESSAGE);
        else
            JOptionPane.showMessageDialog(null , "BAD JOB FRIEND" , "BAD"
                    ,JOptionPane.WARNING_MESSAGE);





        */

        

}


    @Override
    public void actionPerformed(ActionEvent e) {
        boolean confirmation =false;

        double num11 = Double.parseDouble(num1.getText());
        double num22 = Double.parseDouble(num2.getText());
            try {


                if (e.getSource() == plus) {

                    JOptionPane.showMessageDialog(null, "Answer is " + (num11 + num22), "HELLO",
                            JOptionPane.WARNING_MESSAGE);
                }
                if (e.getSource() == minus)
                    JOptionPane.showMessageDialog(null, "Answer is " + (num11 - num22), "HELLO",
                            JOptionPane.WARNING_MESSAGE);

                if (e.getSource() == multi)
                    JOptionPane.showMessageDialog(null, "Answer is " + (num11 * num22), "HELLO",
                            JOptionPane.WARNING_MESSAGE);
                if (e.getSource() == divide)
                    JOptionPane.showMessageDialog(null, "Answer is " + (num11 / num22), "HELLO",
                            JOptionPane.WARNING_MESSAGE);

                else
                    num1.setText(" ");
                    num2.setText(" ");

            } catch (Exception e1) {
                System.out.println(e1);
            }
       // }while(confirmation = true);




}}
