package main;

public class QueueExam<T>{
    T[] arr = (T[]) new Object[10];
    int size= 0;

    public boolean isEmpty(){
        return size==0;
    }

    public void enQeueu(T item){
        if(size == arr.length) reSize();
        arr[size] = item;
        size++;
    }
    public void reSize(){
        if(size < arr.length/2){
            T[] temp = (T[])  new Object[arr.length/2];
            for(int i =0 ; i< arr.length ; i++){
                temp[i] = arr[i];
            }
            arr = temp;
        }

        if(size > arr.length){
            T[] temp = (T[])  new Object[size+1];
            for(int i =0 ; i< arr.length ; i++){
                temp[i] = arr[i];
            }
            arr = temp;
        }
    }

    public T deQueue(){
        T item;
        if(isEmpty()){
            return null ;
        }
        if(size < arr.length/2) reSize();
        item = arr[0];
        for(int i = 0 ; i < arr.length-1 ; i++){
            arr[i] = arr[i+1];
        }
        size--;
        return item;
    }

    public static void main(String[] args) {
        QueueExam<Integer> test = new QueueExam<>();
        test.enQeueu(1);
        test.enQeueu(2);
        test.enQeueu(3);
        test.enQeueu(4);
        test.enQeueu(5);
        System.out.println(test.deQueue());


    }



}
