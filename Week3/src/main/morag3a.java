package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class morag3a extends JFrame implements ActionListener , KeyListener , MouseListener {
    private JLabel lbl1,lbl2, lblResult;
    private JButton  btnCalculate , btnExit;
    private  JTextField txt1 ,txt2;
    private Font font;

    public morag3a(){
        // Set the Layout
        setLayout(new GridLayout(0 ,2 ));
        setSize(700 , 500);
        setBackground(Color.GRAY);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        font = new Font("New Times " , Font.BOLD  | Font.ITALIC , 35 );

        // Set the texts and labels and botTUNS
        lbl1 = new JLabel("First Number: ");
        lblResult = new JLabel();
        txt1 = new JTextField();
        lbl2 = new JLabel("Second Numer");
        txt2 = new JTextField();
        lbl1.setFont(font);
        lbl2.setFont(font);
        lblResult.setFont(font);


        btnCalculate = new JButton("Calculate");
        btnCalculate.setBackground(Color.green);
        btnExit = new JButton("Exit");
        btnExit.setBackground(Color.RED);
        btnExit.setFont(font);
        btnCalculate.setFont(font);
        btnCalculate.setOpaque(true);
        btnExit.setOpaque(true);

        // ADD the stuff to the Frame...
        add(lbl1);
        add(txt1);
        add(lbl2);
        add(txt2);
        add(btnCalculate);
        add(btnExit);
        add(lblResult);

        // Assign ActionListner to the button.
        btnCalculate.addActionListener(this);
        btnExit.addActionListener(this);

        // add Key listener Event
        txt1.addKeyListener(this);
        txt2.addKeyListener(this);

        // Add mouse listener
        btnCalculate.addMouseListener(this);



    }

    public static void main(String[] args) {
        new morag3a();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalculate){
            add();
        }
        else if (e.getSource() == btnExit){
            System.exit(0);
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if(e.getKeyCode() == e.VK_ENTER){
            add();
        }
        if(e.getKeyCode() == e.VK_ESCAPE){
            System.exit(0);
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void add(){
        int num1 = Integer.parseInt(txt1.getText().trim());
        int num2 = Integer.parseInt(txt2.getText().trim());
        int sum = num1 + num2;
        lblResult.setText(sum + "");
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {


    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

        if(e.getSource() == btnCalculate)
            add();
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
