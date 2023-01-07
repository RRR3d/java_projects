package main;

import java.util.Arrays;
import java.util.Random;

public class insertionSort {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10);
        }
        System.out.println("Before:");
        System.out.println((Arrays.toString(numbers)));
        new insertionSort().InsertionGamed(numbers);
        System.out.println("\nAfter:");
        System.out.println((Arrays.toString(numbers)));
    }
    public void insertSort(int[] inputArr){
        for(int i =1; i <inputArr.length ; i++){
            int j = i-1;
            int currentValue = inputArr[i];

            while(j >= 0 && inputArr[j] > currentValue){
                inputArr[j+1] = inputArr[j];
                j--;
            }
           inputArr[j+1] = currentValue;
        }
    }
int x = 1 ;





    public  void InsertionGamed(int[] inputArr){
        for(int i = 1 ; i < inputArr.length ; i++){// 1
            int j = i-1;
            int currentValue = inputArr[i];
            while( j >= 0 && inputArr[j] > currentValue){
                inputArr[j+1] = inputArr[j];
                j--;
            }
            inputArr[j+1] = currentValue;
        }
    }
}
