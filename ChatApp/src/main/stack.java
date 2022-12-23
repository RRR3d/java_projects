package main;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

public class stack<item>{
    private item item;
    private item[] Item_arr;
    int size;
    int n ;




    public stack(int size){
        this.size = size;
        Item_arr =  (item[])  new Object[size];
    }

    public void push(item t){
        Item_arr[n] = t;
        n++;
    }

    public void pop(){
        Item_arr[n] = null;
        n--;
    }

    public void deQ(){
        System.out.println(Item_arr[0] + " GOT OUT");
        Item_arr[0] = null;
        for(int i = 0; i < n ; i++){
            Item_arr[i] = Item_arr[i+1];
        }
        n--;
    }

    public void peek(){
        for(int i = 0; i < Item_arr.length ; i++){
            System.out.println(Item_arr[i]);
        }
    }


 public void reSize(){
        if (n == Item_arr.length){
            size *= 2;
        }
        else size /= 2;
 }

 // push if the push exist delete the dublicated value and add it to index0





    public static void main(String[] args) {
        stack<Integer> s = new stack<>(10);
        s.push(1);  // 1st
        s.push(2);
        s.push(3);
        s.push(1);  // 1st
        s.push(2);
        s.push(3);
        s.push(1);  // 1st
        s.push(2);
        s.push(3);
        s.reSize();
        s.push(10);
        System.out.println("MAXIMIUMM");

       // System.out.println(s.Item_arr.length);

        s.peek();

       // s.reSize();
        System.out.println("F  F SD D FD F");
        //s.deQ();
        s.peek();

    }


}
