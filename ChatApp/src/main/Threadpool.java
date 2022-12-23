package main;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class  Threadpool extends Thread{
    int balance ;

    public Threadpool(int balance){
        this.balance = balance;
    }

    public synchronized void getMoeny( int moeny) throws InterruptedException {
        System.out.println("CHECKING YOUR BALNCE");
        if(balance < moeny){
            System.out.println("SORRY YOUR BALANCE IS:" + balance);
            wait();
        }
        if(balance > moeny){
            balance -= moeny;
            System.out.println("Your new balance is :" + balance);
        }
    }




    public synchronized void diposite(int d_ammount){
       balance += d_ammount;
        System.out.println(
                "YOUR NEW BALANCE IS " + balance
        );
        notifyAll();

    }

    public static void main(String[] args) {
        Threadpool c1 = new Threadpool(1000);
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    c1.getMoeny(1100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
       th.start();

        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                c1.diposite(200);
            }
        });
        th2.start();
    }

}
