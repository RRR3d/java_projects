package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Library extends JFrame implements ActionListener {
    private JButton btn1 , btn2 , btn3;
    private JLabel lbl1 , lbl2 , lbl3;
    private String Name, book, price;
    private Font font;

    // Constructor
    public Library(){
        // set size and layout and visibility and font
        font = new Font("FONT 1 " , Font.BOLD | Font.ITALIC , 20);
        setSize(700 ,500);
        setLayout(new GridLayout(3,2)); // 3 Rows and 2 columns
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // set the lbls and btns
        lbl1 = new JLabel("Name: ");
        btn1 = new JButton("Set Name!");
        lbl2 = new JLabel("Date: ");
        btn2 = new JButton("Set Date!");
        lbl3 = new JLabel("Price: ");
        btn3 = new JButton("Set Price");

        // Set font
        lbl1.setFont(font);
        lbl2.setFont(font);
        lbl3.setFont(font);
        btn1.setFont(font);
        btn2.setFont(font);
        btn3.setFont(font);

        // Add the btns and lbls to the frame
        add(lbl1);
        add(btn1);
        add(lbl2);
        add(btn2);
        add(lbl3);
        add(btn3);

        // Assign the btns to the Action Listner
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

    }

    // the Test Method
    public static void main(String[] args) {
	new Library();
    }

    /**
     * Action Listner to be able to make actions with the buttons
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn1)
            changeName();
        else if(e.getSource() == btn2)
            ChangeBook();
        else if(e.getSource() == btn3)
            ChangePrice();
    }

    /**
     * Function to Change the First lable
     */
    public void changeName(){
        Name = JOptionPane.showInputDialog("Please enter the Name: ");
        lbl1.setText("your name: " + Name);
    }
    /**
     * Function to Change the Second lable
     */
    public void ChangeBook(){
        book = JOptionPane.showInputDialog("Please enter the Book: ");
        lbl2.setText("Book is: " + book);
    }
    /**
     * Function to Change the Third lable
     */
    public void ChangePrice() {
        price = JOptionPane.showInputDialog("Please enter the Price: ");
        lbl3.setText("Price is: " + price);
    }
}
