package main;

public class exam3 implements Runnable{
    @Override
    public void run() {
        add();
    }

    double sum = 0;
    int counter = 1000;

    public synchronized void add(){
        System.out.println(Thread.currentThread().getName() + " is running");
        for(int i = 0 ; i < 1000 ; i++){
            if(counter % 2 == 0){
                sum += counter;
            }
            counter ++;
        }

        if(counter == 5000)
            System.out.println(sum);

    }

    public static void main(String[] args) {
        exam3 e = new exam3();
        Thread th1 = new Thread(e ,"th1");
        Thread th2 = new Thread(e , "th2");
        Thread th3 = new Thread(e ,"th3");
        Thread th4 = new Thread(e , "th4");

        th1.start();
        th2.start();
        th3.start();
        th4.start();

        //System.out.println(e.sum);

    }
}
