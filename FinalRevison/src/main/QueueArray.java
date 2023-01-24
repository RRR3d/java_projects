package main;

public class QueueArray<T> {

    T[] arr =  (T[]) new Object[10];
    int size = 0;

    public void enQueue(T item){
        if (size == arr.length) reSize();
        arr[size] = item;
        size++;
    }

    public T deQueue(){
        T item;
        item = arr[0];
        for(int i = 0 ; i < size-1 ; i++ ){
            arr[i] = arr[i+1];
        }
        size--;
        if(arr.length /4 > size ) reSize();

        return item;
    }


    public void reSize(){
        if(size < arr.length/2){
            T[] temp = (T[]) new  Object[arr.length/2];
            for(int i =0 ; i < arr.length ; i++){
                temp[i] = arr[i];
            }
                    arr =temp;
        }
        else if(size >= arr.length){
            T[] temp = (T[]) new  Object[arr.length*2];
            for(int i =0 ; i < arr.length ; i++){
                temp[i] = arr[i];
            }
            arr = temp;
        }
    }

    public void info(){
        for(int i = 0 ; i < arr.length ; i++ ){
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        QueueArray<Integer> q= new QueueArray<Integer>();

        for(int i = 1 ; i < 16 ; i ++){
            q.enQueue(i);
        }

        System.out.println(q.size);
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(
                "THIS IS THE SHIT"
        );
        q.info();
        System.out.println(q.size);
    }

}
