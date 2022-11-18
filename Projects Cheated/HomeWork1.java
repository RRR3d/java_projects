import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeWork1 extends JFrame implements ActionListener {
    //Create variable we will use it in the program.
    private JLabel lblFName, lblLName, lblPNumber, lblMail, lblSubmit, lblT , lblInfo;
    private JTextField txtFName, txtLName, txtPNumber, txtMail;
    public JButton btnSubmit;
    private Thread thread2 ;
    String tFName = " ", tLName = " ", tPNumber = " ", tMail = " ";
    ImageIcon Icon = new ImageIcon("/Users/omardeef/Desktop/cmpe/homework_2/pic/logo.png");
    JLabel lblIcon = new JLabel();
    private int one ;


    /**
     * This method (HomeWork1) will be show for you massage that:
     * ask you to fill some TextField to save it in variable to use it later.
     * You can run it by main method
     */
    public HomeWork1(){
        lblIcon.setIcon(Icon);
        //Set some option to layout.
        setLayout(null);
        setSize(800, 800);
        setVisible(true);
        setTitle("Please fill in the following data");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Make the JLabel = new JLabel to use it in ths method.
        lblFName = new JLabel("First Name:");
        lblLName = new JLabel("Last Name:");
        lblPNumber = new JLabel("Phone Number:");
        lblMail = new JLabel("E-Mail:");
        lblSubmit = new JLabel("Please Submit--->");
        lblT = new JLabel();
        lblInfo = new JLabel("To contact us call: 0555 555 55 55 or send E-mail to: Booking@email.com");


        txtFName = new JTextField("M...");
        txtLName = new JTextField("K...");
        txtPNumber = new JTextField("X XXX XXX XX XX");
        txtMail = new JTextField("E-Mail@Mail.com");


        btnSubmit = new JButton("Submit");


        btnSubmit.addActionListener(this);


        //Add the variable to the Layout.
        add(lblIcon);
        add(lblFName);
        add(txtFName);
        add(lblLName);
        add(txtLName);
        add(lblPNumber);
        add(txtPNumber);
        add(lblMail);
        add(txtMail);
        add(lblSubmit);
        add(btnSubmit);
        add(lblT);
        add(lblInfo);


        //set location for everyone at the layout by set the X , Y coordinate and Width , Height.
        lblIcon.setBounds(332,66,100,195);
        lblFName.setBounds(253,400,180,30);
        txtFName.setBounds(359,400,180,30);
        lblLName.setBounds(253,439,180,30);
        txtLName.setBounds(359,439,180,30);
        lblPNumber.setBounds(253,479,180,30);
        txtPNumber.setBounds(370,479,180,30);
        lblMail.setBounds(253,519,180,30);
        txtMail.setBounds(319,519,180,30);
        lblSubmit.setBounds(173,572,180,30);
        btnSubmit.setBounds(465,572,180,30);
        lblT.setBounds(279,665,220,30);
        lblInfo.setBounds(100,705,550,30);

    }
    public void a() {
        Load l = new Load();
        thread2 =new Thread(l);
        thread2.start();

        choose j = new choose();
        Thread h = new Thread(j);
        h.start();


    }


    /**
     * The ActionPerFormed method to make action when you press any button.
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnSubmit) {
            //change TextField to String and save it in new variable.
            tFName = txtFName.getText();
            tLName = txtLName.getText();
            tPNumber = txtPNumber.getText();
            tMail = txtMail.getText();
            btnSubmit = btnSubmit;
            try {
                one = (int) Double.parseDouble(tPNumber);
                lblSubmit.setText("Done");
                //Use name user's to thank the user by his name.
                lblT.setText("Thank you for your time " + tFName + " :)");
                //to go to the Loading page.
                //new Load();
                //Using info method to print info.
                info();
                a();

            } catch (Exception e1) {
                JOptionPane.showMessageDialog(null, "Sorry , Phone Number should be Number \n                   Try again ", null, JOptionPane.ERROR_MESSAGE);
            }

        }

    }
    //this method to print the info.
    public void info(){
        System.out.println("First Name :"+tFName);
        System.out.println("Last Name :"+tLName);
        System.out.println("Phone Number :"+tPNumber);
        System.out.println("E-Mail :"+tMail);
    }


    /**
     * This is main method, and I Create it to run the program.
     * @param args
     */
    public static void main(String[] args) {
        new HomeWork1();

    }

}