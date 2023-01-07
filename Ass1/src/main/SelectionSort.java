package main;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[1000000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000000);
        }

        System.out.println("Before:");
        System.out.println((Arrays.toString(numbers)));

        SelectionSort.SelectionGamdFash5(numbers);

        System.out.println("\nAfter:");
        System.out.println((Arrays.toString(numbers)));
    }


    public static void selectionSort(int[] inputArr){

        for(int i = 0 ; i < inputArr.length -1; i++){
            int min = i;

            for(int j = i+1; j < inputArr.length ; j++){
                if(inputArr[j] < inputArr[min] ){
                    min = j;
                }
            }

            int temp = inputArr[i];
            inputArr[i] = inputArr[min];
            inputArr[min] = temp;
        }
    }





    public static void SelectionGamdFash5(int[] inputArr){

        for(int i = 0 ; i < inputArr.length-1 ; i++){
            int min = i;
            for(int j = i+1 ; j < inputArr.length; j++){
                if(inputArr[j] < inputArr[min])
                    min = j;
            }
            int temp = inputArr[i];
            inputArr[i]= inputArr[min];
            inputArr[min] = temp;

        }





    }





}
