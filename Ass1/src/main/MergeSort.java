package main;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

    public void mergeSorting(int[] inputArr){
        int inputLength = inputArr.length;

        if (inputLength < 2 ){
            return;
        }
        int middle= inputLength/2;
        int[] leftSide = new int[middle];
        int[] rightSide = new int[inputLength - middle] ;


        for(int i = 0; i < middle  ; i++){
            leftSide[i] = inputArr[i];
        }
        for(int i = middle; i < inputLength; i++ ){
            rightSide[i - middle] = inputArr[i];
        }

        mergeSorting(rightSide);
        mergeSorting(leftSide);
        mergeing(inputArr , rightSide, leftSide);

    }

    public void mergeing(int[] inputArr , int[] rightSide , int[] leftSide){
        int leftLength = leftSide.length;
        int rightLength = rightSide.length;
        int i =0 , j = 0, k=0;

        while (i < leftLength && j < rightLength) {
            if (leftSide[i] <= rightSide[j]) {
                inputArr[k] = leftSide[i];
                i++;
            } else {
                inputArr[k] = rightSide[j];
                j++;
            }
            k++;
        }
            while(i < leftLength){
                inputArr[k] = leftSide[i];
                i++;
                k++;
            }
            while(j < rightLength){
                inputArr[k] = rightSide[j];
                j++;
                k++;
            }



    }













    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10);
        }

        System.out.println("Before:");
        System.out.println((Arrays.toString(numbers)));

        //new MergeSort().MergeBgd(numbers);

        mergekoko(numbers);
        System.out.println("\nAfter:");
        System.out.println((Arrays.toString(numbers)));
    }


    public void MergeBgd(int[] inputArr) {
        int inputSize = inputArr.length;

        if(inputSize < 2 )
            return;
        int mid = inputSize / 2;
        int[] leftSide = new int[mid];
        int[] rightSide = new int[inputSize - mid];

        for (int i = 0; i < mid; i++) {
            leftSide[i] = inputArr[i];
        }

        for (int i = mid; i < inputSize; i++) {
            rightSide[i - mid] = inputArr[i];
        }

        MergeBgd(rightSide);
        MergeBgd(leftSide);
        mergefash5(inputArr , leftSide , rightSide);

    }

    public void mergefash5(int[] inputArr, int[] leftSide , int[] RightSide){
        int leftSize = leftSide.length;
        int rightSize = RightSide.length;
        int i =0 , k = 0 , j = 0;
        while(i < leftSize && j < rightSize){

            if(leftSide[i] < RightSide[j]){
                inputArr[k] = leftSide[i];
                i++;
            }
            else {
                inputArr[k] = RightSide[j];
                j++;
            }
            k++;
        }

        while (i < leftSize){
            inputArr[k] = leftSide[i];
            i++;
            k++;
        }
        while (j < rightSize){
            inputArr[k] = RightSide[j];
            j++;
            k++;
        }
    }

    public static void mergekoko(int[] inputArr){
        int inputSize = inputArr.length;

        if(inputSize < 2)
            return;

        int mid = inputSize/2;
        int [] leftSide = new int[mid];
        int[] rightSide = new int[inputSize- mid];

        // FOR LEFT SIDE
        for(int i = 0 ; i < mid ; i++ )
            leftSide[i] = inputArr[i];

        for(int i = mid ; i < inputSize ; i++)
            rightSide[i - mid] = inputArr[i];

        mergekoko(rightSide);
        mergekoko(leftSide);
        mergeKOKOLAST(inputArr , leftSide, rightSide);


    }

    public static void mergeKOKOLAST(int[] inputArr , int[] leftSide , int[] rightSide){
        int leftSize = leftSide.length;
        int rightSize = rightSide.length;
        int i=0 , j = 0, k =0;

        while(i < leftSize && j < rightSize) {
            if (leftSide[i] < rightSide[j]) {
                inputArr[k] = leftSide[i];
                i++;
            } else {
                inputArr[k] = rightSide[j];
                j++;
            }
            k++;

        }
        
            while (i < leftSize) {
                inputArr[k] = leftSide[i];
                k++;
                i++;
            }
            while (j < rightSize) {
                inputArr[k] = rightSide[j];
                j++;
                k++;
            }
        }
    }









