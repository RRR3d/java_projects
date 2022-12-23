package main;

public class threadTest2  extends Thread{
    public void run(){
        for(int i = 9 ; i < 100 ; i++){
            System.out.println(i);}
    }
}
