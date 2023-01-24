package main;

import java.util.Arrays;

public class Revision<T> {
    /**
     * MinMaxAvg' function is expected to receive an array of integer as
     * parameter and return an array of floats of length 3,
     * such that the 1st element in the returned array is the minimum value in the array received as parameter,
     * the 2nd element in the returned array is the maximum value in the array received as parameter
     * ,and the 3rd element in the returned array is the average of the values in the array received as parameter.
     */

    public static int[] MinMaxAvg(int[] arr){
        int[] reArr = new int[3];
        int sum =0;
        int min = arr[0];
        int max = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] <  min)
                min = arr[i];
            else if (arr[i] > max)
                max = arr[i];
            sum += arr[i];
        }

        reArr[0] = min;
        reArr[1]= max;
        reArr[2] = sum/arr.length;
        return  reArr;
    }





    /**
     * push() receives a value of generic type T as parameter and creates a new Node object
     * which is appended to the begining (i.e. pointed by firstNode) of the linked list.
     * convertFromLinkedListToString() does not receive any parameter but returns a string
     * which is the concatenation of the string representations of the values on the stack starting from the top
     * of the stack to the bottom of the stack.
     * see the test code on main() method and the sample output below to get a better idea.
     */

    private class Node{
        T item;
        Node next;
    }
    Node first;
    public  void push(T t ){
        if(first == null)
            first.item = t;
        else
            for(Node x = first.next ; x != null ; x = x.next){
                x.item = null;
            }
    }



    public  void ConvertFromLinkedListToString(){


        for(Node x = first ; x.next != null; x = x.next ){

        }
    }

    public void insertValue(T val) {
        Node oldFirst = first;
        first = new Node();
        first.item = val;
        first.next = oldFirst;
    }
    public String toString() {
        String s = "";
        for(Node x = first;x!=null;x=x.next) s=s+" "+x.item.toString();
        return s;
    }

    /**
     * Write a method delete) that takes an int argument k and deletes the kth ele-
     * ment in a linked list, if it exists.
     */


    public void DeleteK(int k ){
        Node temp = first;
        if (k == 0){
            return;
        }
        if(k ==1 ) {
            first = null;
            return;
        }
        for(int i = 1 ; i != k ; i++ ){
            for(Node x = first; x != null ; x = x.next){
                if(i == (k-1) ){

                   x.next = x.next.next;
                }
            }
        }
    }

    public static void main(String[] args) {
      Revision<String> r = new Revision<String>();
      r.insertValue("sss1");
        r.insertValue("sss2");
        r.insertValue("sss3");
        r.insertValue("sss4");
        System.out.println(r.toString());

        r.DeleteK(3);
        System.out.println(r.toString());
    }

}
