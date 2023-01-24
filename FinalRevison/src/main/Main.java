package main;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Binary Search
        int[] arr= new int[1000000];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = i;}
       // System.out.println (BinarySearch(arr , 100));



        //************************ QUEUE **************************
        Queue<String> queue = new Queue<>();
        queue.enQueue("lolo");
        queue.show();
        queue.enQueue("momo");
        queue.enQueue("momo1");
        queue.enQueue("momo2");
        queue.enQueue("momo3");
        queue.enQueue("momo4");

        //System.out.println(queue.deQueue());
        queue.show();
        System.out.println(queue.getSize());
        queue.find("momo3");



        //************************ BAG **************************
        Bag<Integer> bag = new Bag<>();
        bag.add(10);
        bag.add(10);
        bag.add(10);
        bag.add(10);

        //************************ Stack **************************
        Stack<Integer> stack = new Stack<>();
        stack.push(31);
        stack.push(319);
        stack.push(311);
        stack.push(3111);
        stack.push(31111);
        stack.push(311111);

        System.out.println(stack.size);

        //System.out.println(stack.find());

        //************************ SELECTION SORT **************************

        Random random = new Random();
        int[] array  = new int[100];
        for (int j = 0 ; j < array.length ; j++){
            array[j] = random.nextInt(100);
        }
        System.out.println("BEFORE SORTING: ");
        System.out.println(Arrays.toString(array));


       // System.out.println(Arrays.toString(array));


        //************************ INSERTION SORT **************************
       // InsertionSort(array);



        //************************ MERGE SORT **************************
        //MergeSort(array);
        //System.out.println("AFTER SORTING: ");
        //System.out.println(Arrays.toString(array));

        //************************ QUICK SORT **************************
        QuickSort(arr , 0 , arr.length-1);
        System.out.println(Arrays.toString(array));

    }


    public static int BinarySearch(int[] arr , int target){
        int lo = 0;
        int hi = arr.length ;

        while ( lo <= hi ){

            int mid = lo + (hi - lo) /2 ;
            System.out.println(arr[mid] + " MID");
            if(target > arr[mid])
                lo = mid +1;
            else if(target < arr[mid])
                hi = mid -1;
            else return mid;
        }
        return -1;
    }


    public static class Bag<Item>{
       public class Node {
           Item item;
           Node next;
       }
        int size  = 0;
        Node first ;
        public boolean isEmpty() {return size ==0;}
        public void add(Item item){
            if (!isEmpty()){
                first.item = item;
            }
            Node oldFirst = first;
            first = new Node();
            first.item = item;
            first.next = oldFirst ;
            size++;
        }
        public  Item  show(){
            return first.item;
        }
        public int Size() {return  size ;}
    }


    public static class Queue<Item> {  // FIFO
        public void show(){
            System.out.println(last.item);
        }
        public int getSize(){
            return size;
        }
        private class Node{
            Item item;
            Node next;
        }

        Node first;
        Node last;
        int size =0 ;

        public boolean isEmpty(){return  size == 0;}

        public void enQueue(Item item){
            Node newLast = last;
            last = new Node();
            last.item = item;
            last.next = null;

            if(isEmpty())
                first = last;
            else{
                newLast.next = last;
            }
            size++;
        }

        public Item deQueue(){
            Item firstItem = first.item;
            first = first.next;
            if(isEmpty()){
                last = null;
            }
            size--;

            return  firstItem;
        }


        public int find(Item key){
            int index = 0;
            // for(int i = 0 ; i < 10 ; i++);
            for(Node x = first; x != null; x = x.next){
                index++;
                if(x.item == key){
                    return index;
                }
            }
            return -1;
        }







    }


    public static class Stack<Item>{ // LIFO
        private class Node{
            Item item;
            Node next;
        }
        private Node first;
        private int size=0;
        public boolean isEmpty() {return size==0;}

        public void push(Item item){
            Node oldTemp = first;
            first = new Node();
            first.item = item;
            first.next = oldTemp;
            size++;
        }

        public Item pop(){
            Item oldItem  = first.item;
            first =first.next;
            size--;
            return oldItem;
        }




        public Item pop2(){
           Item item = first.item;
           first = first.next;
           size--;
           return  item;

        }





    }

    public static void SelectionSort(int[] arr){
        for(int i = 0 ; i < arr.length -1 ; i++){
            int min = arr[i];
            for(int j = i+1 ; j < arr.length;j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i -1 ;
            while (j >= 0  && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }

    }


    public static void MergeSort(int[] arr){
        if(arr.length < 2){
            return;
        }
        int mid = arr.length/2 ;
        int[] leftSide =new int[mid];
        int[] rightSide = new int[arr.length-mid];

        for(int i = 0 ; i < mid ; i++){
            leftSide[i] = arr[i];
        }
        for(int i = mid ; i < arr.length ; i++){
            rightSide[i - mid] = arr[i];
        }

        MergeSort(leftSide);
        MergeSort(rightSide);
        merging(leftSide , rightSide , arr);
    }
    public static void merging(int[] left  , int[] right ,int[] arr){
        int i=0, k =0 ,j =0;
        int leftSize = left.length;
        int rightSize = right.length;

        while(i < leftSize && j < rightSize){
            if(left[i] >= right[j]){
                arr[k] = right[j];
                j++;
            }
            else {
                arr[k] = left[i];
                i++;
            }
            k++;
        }
        while(i < leftSize){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < rightSize){
            arr[k] = right[j];
            j++;
            k++;
        }
        }


    public static void QuickSort(int[] arr , int start , int end){

        if( end <= start)return;
        int pivot = partition(arr, start ,end);
        QuickSort(arr, start , pivot-1);
        QuickSort(arr, pivot+1 , end);


    }

    public static int  partition(int[] arr , int start , int end){
        int pivot  = arr[end];
        int i = start-1;
        for(int j = start ; j  <= end -1 ; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr , i , j );
            }
        }
        i++;
        swap(arr , end , i);
        return i;
    }
    public static void swap(int[] arr , int x , int y){
        int temp = arr[x] ;
        arr[x] =arr[y] ;
        arr[y]= temp;
    }





}
