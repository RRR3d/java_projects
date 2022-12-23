package main;

public class Main {

    public static void main(String[] args) {
        threadTest threadTest = new threadTest();
        Thread thread = new Thread(threadTest);

        threadTest2 th2 = new threadTest2();
        th2.start();
        thread.start();


    }
}
