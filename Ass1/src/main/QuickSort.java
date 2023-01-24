package main;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {


public void Quicksort(int[] array , int lowIndex , int highIndex){

    if ( lowIndex >= highIndex)
        return;

    int pivot = array[highIndex];

    int leftPointer = lowIndex;
    int rightPointer = highIndex;

    while(leftPointer < rightPointer){

        while (array[leftPointer] <= pivot && leftPointer < rightPointer){
            leftPointer++;
        }
        while(array[rightPointer] >= pivot && leftPointer < rightPointer){
            rightPointer--;
        }
        swap(array , leftPointer , rightPointer);
    }
    swap(array , leftPointer , highIndex);
    Quicksort(array , lowIndex , leftPointer -1 );
    Quicksort(array , leftPointer +1 , highIndex);
}



public void QuickSORTGAMDN(int[] array , int lowIndex ,int  highIndex){

    if(lowIndex >= highIndex)
        return;
    int pivot = array[highIndex];
    int leftPointer = lowIndex;
    int rightPointer = highIndex-1;

    while(leftPointer < rightPointer){
        while(array[leftPointer] < pivot && leftPointer < rightPointer){
            leftPointer++;}
        while(array[rightPointer] > pivot && leftPointer < rightPointer){
            rightPointer--;
        }
        swap(array , leftPointer , rightPointer);
    }
    swap(array, leftPointer , highIndex);
    QuickSORTGAMDN(array , lowIndex, rightPointer- 1 );
    QuickSORTGAMDN(array , rightPointer+1 , highIndex);
}

















    public void swap(int[] inpuArr , int i , int j) {
        int temp = inpuArr[i];
        inpuArr[i] = inpuArr[j];
        inpuArr[j] = temp;
    }

    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[100000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10000000);
        }

        System.out.println("Before:");
       // System.out.println((Arrays.toString(numbers)));

        new QuickSort().QuickSORTGAMDN(numbers , 0 , numbers.length-1);

        System.out.println("\nAfter:");
        //System.out.println((Arrays.toString(numbers)));
    }

}
