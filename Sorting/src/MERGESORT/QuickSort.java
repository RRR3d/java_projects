package MERGESORT;

import java.util.Arrays;

public class QuickSort {

    public void quicksort(int[] array , int lowIndex ,int HighIndex){
        if(lowIndex >= HighIndex)
            return;
        int pivot = array[HighIndex] ;
        int lefPointer = lowIndex;
        int righPointer = HighIndex;

        while(lefPointer < righPointer){
            while(array[lefPointer]  <= pivot && lefPointer < righPointer){
                lefPointer++;
            }
            while(array[righPointer] >= pivot && lefPointer < righPointer){
                righPointer--;
            }

            swap(array , lefPointer , righPointer);
        }

        swap(array , lefPointer , HighIndex);
        quicksort(array, lowIndex, righPointer -1);
        quicksort(array , righPointer +1 , HighIndex);
    }
    public static void swap(int[] array , int index1 , int index2 ){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }


    public static void main(String[] args) {
        int[] arr = {1,3,35,542,564,26,426,427,427,247,247,427,24,74,2724,7};
        System.out.println("Before " + Arrays.toString(arr));
        new QuickSort().quicksort(arr , 0 , arr.length -1);
        System.out.println("AFTER " + Arrays.toString(arr));
    }
}



