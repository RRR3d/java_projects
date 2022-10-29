package main;

public class Vehicle {
    private Man man;
    private double price;

    public Vehicle(){}
    public Vehicle(Man man , double price){
        this.man = man;
        this.price  = price;
    }

    public Man getMan() {
        return man;
    }

    public void setMan(Man man) {
        this.man = man;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void move(){}

    public String toString(){
        return man + " " + price;
    }
}
