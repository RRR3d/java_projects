package main;

public class exam2 extends Thread implements Ibilgi{

    double sum = 0;
    @Override
    public double add(double X, int n) {
        for(int i = 1 ; i < n ; i++){
           sum +=  Math.pow(X , n);
        }
        return sum;
    }
    double X ;
     int n;
    public exam2(double X , int n){
        this.X = X ;
        this.n = n;
    }
    @Override
    public void run() {
        add(X, n);

    }

    public static void main(String[] args) {
        exam2 e = new exam2(2,5);
        e.start();
        System.out.println(e.add(e.X, e.n));
    }
}

interface Ibilgi{
     double add(double X , int n);
}
