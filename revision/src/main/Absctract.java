package main;

import javax.xml.namespace.QName;

public abstract class Absctract {
    int i;
    String name;

    public Absctract(int i){
        this.i = i;
    }
    public Absctract(){}

    public void print(){
        System.out.println("HI");
    }

    public abstract void copy();


}



class subclass extends Absctract{
    int s = 0;
    public void copy(){
        System.out.println("HIII");
    }

    public subclass(int i , String name, int s){
        super();
        this.s = s;
    }


}

