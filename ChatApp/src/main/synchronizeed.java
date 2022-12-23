package main;

import java.util.concurrent.Semaphore;

public class synchronizeed {

    int count = 0;
    public void increment(){
        count+= 1;
    }

    public static void main(String[] args) throws Exception {

        Semaphore semaphore = new Semaphore(1 );

        synchronizeed s1 = new synchronizeed();


        Thread th1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for(int i = 0 ; i < 1000 ; i++){
                    s1.increment();
                }
            }
        });
        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i < 1000 ; i++){
                    s1.increment();
                }
            }
        });

        th1.setPriority(2);
        th2.setPriority(1);

        th1.start();
        th2.start();
        th1.join();
        th2.join();

        System.out.println(s1.count);

    }
}
