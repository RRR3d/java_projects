package main;

public class test1Q<T>{
    T[] arr = (T[]) new Object[10];
    int size = 0;

    public boolean isEmpty(){return size ==0;}
    public void reSize(){
        if(size < arr.length/2){
            T[] temp = (T[]) new Object[arr.length/2];
            arr =temp;
        }
        if(size >= arr.length){
            T[] temp = (T[]) new Object[arr.length*2];
            arr =temp;
        }
    }


    public void enQueue(T item){
        if(size >= arr.length) reSize();
        arr[size] = item;
        size++;
    }
    public T deQueue(){
        T item = arr[0];
        for(int i =0; i < arr.length-1 ; i++){
            arr[i] = arr[i+1];
        }
        size--;
        if(size < arr.length/4) reSize();
        return item;
    }


    public static void main(String[] args) {
        test1Q<Integer> t = new test1Q<>();
        for(int i = 0 ; i < 11 ; i++) {
            t.enQueue(i);
        }
        System.out.println("SIZE: " + t.size);
        for(int i = 0 ; i < 9; i++) {
            t.deQueue();
        }
        System.out.println( "SIZE: "+ t.size);

    }

}
