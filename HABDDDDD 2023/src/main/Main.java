package main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;class Main {

    public static  int[]  insertNewValueToArray( int[] array , int num , boolean isTrue  ) {

        int[] newArray = new int[array.length+1];
        int i;

        if(isTrue == true) {
            for (i = 0; i < N; i++) {
                newArray[i] = array[i];
            }
            newArray[i] = num;
        }

        if(isTrue == false){
            for(i = array.length ; i != 0 ; i--){
                newArray[i] = array[i-1];
            }
            newArray[0] = num;
        }

        return newArray;

    }

    public static int[] removeValueFromArray( int[ ] array , boolean isTrue){
        int[] newArray = new int[array.length];

    }

    public static void main(String[] args) {

        int[] a= { 1,2,3,4,5,6};
        System.out.println(Arrays.toString(insertNewValueToArray(a, 9, true)));
        System.out.println(Arrays.toString(insertNewValueToArray(a, 9, false)));

    }
}