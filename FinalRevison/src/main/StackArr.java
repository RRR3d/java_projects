package main;

public class StackArr<T>{
    T[] arr = (T[]) new Object[10];
    int size =0;

    public static void main(String[] args) {
        StackArr<Integer> s = new StackArr<>();
        for(int i =1 ; i < 14 ; i++ ) {
            s.push(i);
        }
        System.out.println("THIS IS THE " + s.pop());
        s.print();
    }

    public void print(){
        for(int i =0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
    public void push(T item){
        if(size == arr.length) reSize();
        arr[size] = item;
        size++;
    }
    public boolean isEmpty(){return size == 0;}
    public T pop(){
        if(isEmpty()) return null;

        T item = arr[--size];
        arr[size] = null;
        reSize();

        return item;
    }


    public void reSize(){
        if(size < arr.length/2){
            T[] temp = (T[]) new Object[arr.length/2];
            for(int i = 0 ; i < arr.length ; i++){
                temp[i] = arr[i];
            }
            arr =temp;
        }

        if(size >= arr.length){
            T[] temp = (T[]) new Object[size+1];
            for(int i = 0 ; i < arr.length ; i++){
                temp[i] = arr[i];
            }
            arr =temp;
        }
    }
}
