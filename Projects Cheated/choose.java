import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class choose extends JFrame implements ActionListener , Runnable  {
    //Create variable we will use it in the program.
    private JLabel lblTit ,lblT  , lblFoot , lblBasket , lblTennis , lblVolley ,lblf , lblf1 ,lblf2 , lblb ,lblb1 ,lblb2 , lblv , lblv1 ,lblv2 , lblPriceT,lblPriceF , lblPriceF1,lblPriceF2, lblPriceB , lblPriceB1 ,lblPriceB2 , lblPriceV,lblPriceV1 , lblPriceV2;
    private JButton btnFoot ,btnFootIn , btnFootOut , btnBasketIn , btnBasketOut, btnBasket ,btnTennis ,btnVolley , btnVolleyIn , btnVolleyOut ,btnBackF,btnBackB,btnBackV;
    private ImageIcon iFoot ,iFootIn, iFootOut , iBasketIn , iBasketOut ,iBasket ,iTennis , iVolley , iVolleyIn , iVolleyOut;
    private Font font ,f;
    String Sport = "" , Price = "";
    private Thread thread2;
    int sleep=0;

    /**
     * This method to design the main page of the app to
     * ask you about some information about booking like:
     * type of sport indoor or outdoor...
     */
    public void choose(){
        //set the font.
        font=new Font("d",Font.HANGING_BASELINE|Font.TYPE1_FONT,30);
        //Set some option to layout.
        setLayout(null);
        setSize(800, 800);
        setVisible(true);
        setTitle("Please choose one");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        iFoot = new ImageIcon("/Users/omardeef/Desktop/cmpe/homework_2/pic/F.jpg");
        iBasket = new ImageIcon("/Users/omardeef/Desktop/cmpe/homework_2/pic/B.jpg");
        iTennis = new ImageIcon("/Users/omardeef/Desktop/cmpe/homework_2/pic/T.jpg");
        iVolley = new ImageIcon("/Users/omardeef/Desktop/cmpe/homework_2/pic/V.jpg");
        //Make the JLabel = new JLabel to use it in ths method.
        lblTit =new JLabel("SPORT");
        lblT = new JLabel("Press the picture of the sport you want to register in:");
        lblFoot = new JLabel("FootBall");
        lblBasket = new JLabel("BasketBall");
        lblTennis = new JLabel("Tennis");
        lblVolley = new JLabel("VolleyBall");
        lblPriceF2 = new JLabel("300 TL/h-350 TL/h");
        lblPriceB2 = new JLabel("300 TL/h-350 TL/h");
        lblPriceV2 = new JLabel("400 TL/h-450 TL/h");
        lblPriceT = new JLabel("300TL/h");


        //set font for the title.
        lblTit.setFont(font);
        //Make the JButton = new JButton to use it in ths method.
        btnFoot =new JButton();
        btnBasket =new JButton();
        btnTennis = new JButton();
        btnVolley =new JButton();
        //set teh icon in the button.
        btnFoot.setIcon(iFoot);
        btnBasket.setIcon(iBasket);
        btnTennis.setIcon(iTennis);
        btnVolley.setIcon(iVolley);

        //Add the variable to the Layout.
        add(lblTit);
        add(lblT);
        add(lblFoot);
        add(lblBasket);
        add(lblTennis);
        add(lblVolley);

        add(btnFoot);
        add(btnBasket);
        add(btnTennis);
        add(btnVolley);

        add(lblPriceF2);
        add(lblPriceB2);
        add(lblPriceV2);
        add(lblPriceT);

        btnFoot.addActionListener(this);
        btnBasket.addActionListener(this);
        btnTennis.addActionListener(this);
        btnVolley.addActionListener(this);

        //set location for everyone at the layout by set the X , Y coordinate and Width , Height.
        lblTit.setBounds(350, 30, 200 , 100);
        lblT.setBounds(50, 150 , 400 , 30);
        btnFoot.setBounds(50,200,300,200);
        btnBasket.setBounds(450,200,300,200);
        btnTennis.setBounds(50,450,300,200);
        btnVolley.setBounds(450,450,300,200);
        lblFoot.setBounds(175,400,100,30);
        lblPriceF2.setBounds(140,415,180,30);
        lblBasket.setBounds(580,400,80,30);
        lblPriceB2.setBounds(550,415,180,30);
        lblTennis.setBounds(175,650,100,30);
        lblPriceT.setBounds(170,665,100,30);
        lblVolley.setBounds(580,650,80,30);
        lblPriceV2.setBounds(550,665,180,30);



    }

    /**
     * kk method to go to next page to choose indoor or outdoor when you click on FootBall Button.
     */
    public void kk(){
        f=new Font("jifs",Font.PLAIN|Font.PLAIN,15);
        JFrame j = new JFrame();
        j.setLayout(null);
        j.setSize(800, 800);
        j.setVisible(true);
        j.setTitle("choose one");
        j.setDefaultCloseOperation(EXIT_ON_CLOSE);

        iFootIn = new ImageIcon("/Users/omardeef/Desktop/cmpe/homework_2/pic/Fin.jpg");
        iFootOut = new ImageIcon("/Users/omardeef/Desktop/cmpe/homework_2/pic/Fout.jpg");

        lblf = new JLabel("Choose the playground (IN or OUT) door:");
        lblf1 = new JLabel("In door");
        lblf2 = new JLabel("Out door");
        lblPriceF = new JLabel("300TL/h");
        lblPriceF1 = new JLabel("350TL/h");

        btnFootIn = new JButton();
        btnFootOut = new JButton();
        btnBackF  = new JButton("Back To main Page");


        btnFootIn.setIcon(iFootIn);
        btnFootOut.setIcon(iFootOut);
        btnBackF.addActionListener(this);

        j.add(lblf);
        j.add(lblf1);
        j.add(lblf2);
        j.add(btnBackF);
        j.add(btnFootIn);
        j.add(btnFootOut);
        j.add(lblPriceF);
        j.add(lblPriceF1);

        btnFootIn.addActionListener(this);
        btnFootOut.addActionListener(this);

        lblf.setBounds(50 , 250 , 400 , 30);
        lblf1.setBounds(170 , 510 , 80 , 30);
        lblf2.setBounds(570 , 510 , 80 , 30);
        lblPriceF.setBounds(170 , 540 , 80 , 30);
        lblPriceF1.setBounds(570 , 540 , 80 , 30);
        lblf.setFont(f);
        lblf1.setFont(f);
        lblf2.setFont(f);
        lblPriceF.setFont(f);
        lblPriceF1.setFont(f);

        btnFootIn.setBounds(50 , 300 , 300 ,200);
        btnFootOut.setBounds(450 , 300 , 300 ,200);
        btnBackF.setBounds(100 , 700 , 600 , 30);

    }

    /**
     * jj method to go to next page to choose indoor or outdoor when you click on BasketBall Button.
     */
    public void jj(){
        f=new Font("jifs",Font.PLAIN|Font.PLAIN,15);
        JFrame h = new JFrame();
        h.setLayout(null);
        h.setSize(800, 800);
        h.setVisible(true);
        h.setTitle("choose one");
        h.setDefaultCloseOperation(EXIT_ON_CLOSE);

        iBasketIn = new ImageIcon("/Users/omardeef/Desktop/cmpe/homework_2/pic/Bin.jpg");
        iBasketOut = new ImageIcon("/Users/omardeef/Desktop/cmpe/homework_2/pic/Bout.jpg");
        btnBasketIn = new JButton();
        btnBasketOut = new JButton();
        btnBasketIn.setIcon(iBasketIn);
        btnBasketOut.setIcon(iBasketOut);
        btnBasketIn.addActionListener(this);
        btnBasketOut.addActionListener(this);
        lblb = new JLabel("Choose the playground (IN or OUT) door:");
        lblb1 = new JLabel("In door");
        lblb2 = new JLabel("Out door");
        lblPriceB = new JLabel("350TL/h");
        lblPriceB1 = new JLabel("300TL/h");
        btnBackB  = new JButton("Back To main Page");
        btnBackB.addActionListener(this);
        h.add(lblb);
        h.add(lblb1);
        h.add(lblb2);
        h.add(btnBasketIn);
        h.add(btnBasketOut);
        h.add(btnBackB);
        h.add(lblPriceB);
        h.add(lblPriceB1);

        lblb.setBounds(50 , 250 , 400 , 30);
        lblb1.setBounds(170 , 510 , 80 , 30);
        lblb2.setBounds(570 , 510 , 80 , 30);
        lblb.setFont(f);
        lblb1.setFont(f);
        lblb2.setFont(f);
        lblPriceB.setFont(f);
        lblPriceB1.setFont(f);
        lblPriceB.setBounds(170 , 540 , 80 , 30);
        lblPriceB1.setBounds(570 , 540 , 80 , 30);

        btnBasketIn.setBounds(50 , 300 , 300 ,200);
        btnBasketOut.setBounds(450 , 300 , 300 ,200);
        btnBackB.setBounds(100 , 700 , 600 , 30);

    }

    /**
     * gg method to go to next page to choose indoor or outdoor when you click on VolleyBall Button.
     */
    public void gg(){
        f=new Font("jifs",Font.PLAIN|Font.PLAIN,15);
        JFrame o = new JFrame();
        o.setLayout(null);
        o.setSize(800, 800);
        o.setVisible(true);
        o.setTitle("choose one");
        o.setDefaultCloseOperation(EXIT_ON_CLOSE);
        iVolleyIn = new ImageIcon("/Users/omardeef/Desktop/cmpe/homework_2/pic/Vin.jpg");
        iVolleyOut = new ImageIcon("/Users/omardeef/Desktop/cmpe/homework_2/pic/Vout.jpg");
        btnVolleyIn = new JButton();
        btnVolleyOut = new JButton();
        btnVolleyIn.setIcon(iVolleyIn);
        btnVolleyOut.setIcon(iVolleyOut);
        btnVolleyIn.addActionListener(this);
        btnVolleyOut.addActionListener(this);
        lblv = new JLabel("Choose the playground (IN or OUT) door:");
        lblv1 = new JLabel("In door");
        lblv2 = new JLabel("Out door");
        btnBackV= new JButton("Back To main Page");
        lblPriceV = new JLabel("400TL/h");
        lblPriceV1 = new JLabel("450TL/h");
        btnBackV.addActionListener(this);
        o.add(lblv);
        o.add(lblv1);
        o.add(lblv2);
        o.add(btnVolleyIn);
        o.add(btnVolleyOut);
        o.add(btnBackV);
        o.add(lblPriceV);
        o.add(lblPriceV1);

        lblv.setBounds(50 , 250 , 400 , 30);
        lblv1.setBounds(170 , 510 , 80 , 30);
        lblv2.setBounds(570 , 510 , 80 , 30);
        lblv.setFont(f);
        lblv1.setFont(f);
        lblv2.setFont(f);
        lblPriceV.setFont(f);
        lblPriceV1.setFont(f);
        lblPriceV.setBounds(170 , 540 , 80 , 30);
        lblPriceV1.setBounds(570 , 540 , 80 , 30);

        btnVolleyIn.setBounds(50 , 300 , 300 ,200);
        btnVolleyOut.setBounds(450 , 300 , 300 ,200);
        btnBackV.setBounds(100 , 700 , 600 , 30);

    }
    //this method to print the info.
    public void info(){
        System.out.println(Sport);
        System.out.println(Price);
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
        if (e.getSource()==btnFoot){
            //Using kk method to go to next page.
            kk();
        }
        if (e.getSource()==btnFootIn){
            Sport="FootBall in door";
            Price="300TL/h";
            JOptionPane.showMessageDialog(null,Sport+"\nPrice:"+Price);
        }
        if (e.getSource()==btnFootOut){
            Sport="FootBall out door";
            Price="350TL/h";
            JOptionPane.showMessageDialog(null,Sport+"\nPrice:"+Price);
        }
        if (e.getSource()==btnBackF){
            //Using Back Button to show the choose method again.
           a();
        }
        if (e.getSource()==btnBasket){
            //Using kk method to go to next page.
            jj();
        }
        if (e.getSource()==btnBasketIn){
            Sport="BasketBall in door";
            Price="350TL/h";
            JOptionPane.showMessageDialog(null,Sport+"\nPrice:"+Price);

        }
        if (e.getSource()==btnBasketOut){
            Sport="BasketBall out door";
            Price="300TL/h";
            JOptionPane.showMessageDialog(null,Sport+"\nPrice:"+Price);

        }
        if (e.getSource()==btnBackB){
            //Using Back Button to show the choose method again.
            a();
        }
        if (e.getSource()==btnTennis){
            Sport="Tennis";
            Price="300TL/h";
            JOptionPane.showMessageDialog(null,Sport+"\nPrice:"+Price);

        }
        if (e.getSource()==btnVolley){
            //Using kk method to go to next page.
            gg();

        }
        if (e.getSource()==btnVolleyIn){
            Sport="VolleyBall in door";
            Price="400TL/h";
            JOptionPane.showMessageDialog(null,Sport+"\nPrice:"+Price);

        }
        if (e.getSource()==btnVolleyOut){
            Sport="VolleyBall out door";
            Price="450TL/h";
            JOptionPane.showMessageDialog(null,Sport+"\nPrice:"+Price);

        }
        if (e.getSource()==btnBackV){
            //Using Back Button to show the choose method again.
            a();

        }
        info();


    }

    /**
     * This is main method, and I Create it to run the program.
     * @param args
     */
    public static void main(String[] args) {
        choose j = new choose();
        Thread h = new Thread(j);
        h.start();


    }

    @Override
    public void run() {

            try {
                sleep=2000;
                Thread.currentThread().sleep(sleep);
                choose();
            }
            catch ( InterruptedException e) {
                // TODO: handle exception
                System.out.println(e.getMessage());
            }

    }
}

