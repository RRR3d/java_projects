package main;

import java.util.Stack;

public class StackRevision<T> {

    private class Node{
        T item;
        Node next;
    }
    Node first = new Node();
    Node last = new Node();
    int size =0;
    public boolean isEmpty(){return size==0;}

    public void push(T item){
        if(size == 0){
            first.item = item;
            last = first;
        }
        Node oldLast = last;


    }

    public T pop(){
        T item = last.item;
        for(Node x = first; x != null; x = x.next){
            if(x.next.next == null){
                x.next= null;
            }
        }
        size--;
        return item;
    }
    public void info(){
        for( int i = 0 ; i < size ; i++){
            System.out.println(pop());

        }
    }

    public static void main(String[] args) {
        StackRevision<Integer>  t = new StackRevision<>();
        t.push(1);
        t.push(2);
        t.push(3);
        t.push(4);
        t.pop();


        t.info();




    }





}
