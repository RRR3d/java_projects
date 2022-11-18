import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Load extends JFrame implements Runnable {
    //Create variable we will use it in the program.
    private JLabel lblLoading, lblPoint1, lblPoint2, lblPoint3;
    public JButton btnOk, btn;
    private Thread thread1 ;
    static long start_time = System.currentTimeMillis();
    static long wait_time = 2000;
    static long end_time = start_time + wait_time;
    private Font font;

    /**
     * This method to design the Loading page of the app.
     */
    public Load() {
        //set the font.
        font = new Font("fyguyh", Font.PLAIN | Font.TYPE1_FONT, 20);
        //Set some option to layout.
        setLayout(null);
        setSize(400, 400);
        setVisible(true);
        setTitle("Loading");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Make the JLabel = new JLabel to use it in ths method.
        lblLoading = new JLabel("Loading");
        // lblOk = new JLabel("Click (Yes) to go to the next Page:");
        lblPoint1 = new JLabel(".");
        lblPoint2 = new JLabel(".");
        lblPoint3 = new JLabel(".");

        //Make the JButton = new JButton to use it in ths method.
        btnOk = new JButton("Ok");

        //Add the variable to the Layout.
        add(lblLoading);
        add(lblPoint1);
        add(lblPoint2);
        add(lblPoint3);
        //add(lblOk);
        //add(btnOk);


        //set location for everyone at the layout by set the X , Y coordinate and Width , Height.
        btnOk.setBounds(170, 300, 60, 30);
        lblLoading.setBounds(120, 160, 100, 30);
        lblPoint1.setBounds(210, 160, 40, 30);
        lblPoint2.setBounds(215, 160, 40, 30);
        lblPoint3.setBounds(220, 160, 40, 30);

        //set font.
        lblLoading.setFont(font);
        lblPoint1.setFont(font);
        lblPoint2.setFont(font);
        lblPoint3.setFont(font);

        thread1 = new Thread(this);

    }

        //while loop to run the program to for only some time I set it in the wait_time.
        public void v (){

        while (System.currentTimeMillis() < end_time) {
            for (int i = 0; i <= 120; i++) {

                if (i <= 20) {
                    //if to change points color.
                    lblPoint2.setForeground(Color.WHITE);
                    lblPoint3.setForeground(Color.WHITE);
                }
                if (i > 20 && i <= 40) {
                    lblPoint2.setForeground(Color.BLACK);
                    lblPoint3.setForeground(Color.WHITE);
                }
                if (i > 40 && i <= 60) {
                    lblPoint2.setForeground(Color.BLACK);
                    lblPoint3.setForeground(Color.BLACK);

                }
                if (i > 60 && i <= 80) {
                    lblPoint2.setForeground(Color.WHITE);
                    lblPoint3.setForeground(Color.WHITE);

                }
                if (i > 80 && i <= 100) {
                    lblPoint2.setForeground(Color.BLACK);
                    lblPoint3.setForeground(Color.WHITE);

                }
                if (i > 100 && i <= 120) {
                    lblPoint2.setForeground(Color.BLACK);
                    lblPoint3.setForeground(Color.BLACK);

                } else {

                }


            }

            }
        }





    /**
     * This is main method, and I Create it to run the program.
     * @param args
     */
    public static void main(String[] args) {
        Load i = new Load();
        Thread j = new Thread(i);
        j.start();


    }


    @Override
    public void run() {
        v();

    }
}

