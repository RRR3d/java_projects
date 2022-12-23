package main;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Bag<item>  {
    item item;
    item[] Item_arr;
    int n = 0;


    public Bag( int i){

//        Item_arr = (item[]) new Object[i];
        Item_arr  = (item[])  new Object[i];
    }
    public void add(item t ){
       Item_arr[n] = t;
        n++;
    }

    public boolean isEmpty(){
        return n==0;
    }

    public int size(){
        return n;
    }
    public void peek(){
        for(int i = 0; i < n ; i++){
            System.out.println(Item_arr[i]);
        }
    }


    public static void main(String[] args) {
        Bag<String> b = new Bag<String>(2);
       b.add("kiki");
       b.add("soso");
        System.out.println(b.isEmpty());
        System.out.println(b.size());
       b.peek();

    }

}
