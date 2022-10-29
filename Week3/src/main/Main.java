package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener , MouseListener , KeyListener {
    private  JTextField txtFirst,txtSecond;
    private  JLabel lblFirst, lblSecond , lblResult , lblShow;
    private JButton btnCaluclate ,btnExit;
    public Main() {
        setLayout(new GridLayout(0,2));
        lblFirst = new JLabel("First");
        txtFirst = new JTextField();
        txtFirst.setText("Input an integer number!");

        lblSecond = new JLabel("Second");
        txtSecond = new JTextField();

        lblResult = new JLabel("Result");
        lblShow = new JLabel();
        lblShow.setOpaque(true);
        lblShow.setBackground(Color.pink);

        btnCaluclate = new JButton("Calculate");
        btnExit = new JButton("Exit");

        add(lblFirst);
        add(txtFirst);
        add(lblSecond);
        add(txtSecond);
        add(btnCaluclate);
        add(btnExit);
        add(lblResult);
        add(lblShow);

        // register btns to handle actuon
        // btnCaluclate.addActionListener(this);
        btnExit.addActionListener(this);

        // register for mouse events
        btnCaluclate.addMouseListener(this);
        txtFirst.addMouseListener(this);

        // regesiter for Key events
        txtSecond.addKeyListener(this);

        setSize(5005 ,500);
        setVisible(true);
        setTitle("TEST EVENTS ");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }





    public static void main(String[] args) {
	    new Main();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if ( e.getSource() == btnCaluclate){
            calculate();
        }
        else if (e.getSource() == btnExit)
            System.exit(0);
    }
    private  void calculate() {
        int one = Integer.parseInt(txtFirst.getText().trim());
        int second = Integer.parseInt(txtSecond.getText().trim());
        int sum = one + second;
        lblShow.setText(sum + "");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == btnCaluclate)
            calculate();
        else if (e.getSource() == txtFirst)
            txtFirst.setText("");

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

        //JOptionPane.showMessageDialog(this , "Click");
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {  // when ever any keys are pressed
        //txtFirst.setText(e.getKeyChar() + "");
    }

    @Override
    public void keyPressed(KeyEvent e) { // we use this if we have a function keys

        if(e.getKeyCode() == e.VK_ENTER)
            calculate();
        else if (e.getKeyCode() == e.VK_ESCAPE)
            System.exit(0);

    }

    @Override
    public void keyReleased(KeyEvent e) {  // when the key is released  we check the number or the text that you have entered

    }
}
