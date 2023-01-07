package MERGESORT;

import java.util.Arrays;

public class MERGESORT {

    public void mergeSort(int[] inputArr){
        int inputSize = inputArr.length;

        if(inputSize < 2 )
            return;

        int mid = inputSize/2 ;
        int[] leftSide =  new int[mid];
        int[] rightSide = new int[inputSize - mid];

        for(int i = 0 ; i < mid  ; i++){
            leftSide[i] = inputArr[i];
         }

        for(int i = mid ; i < inputSize ; i++){
            rightSide[i-mid] = inputArr[i];
        }

        mergeSort(leftSide);
        mergeSort(rightSide);
        merge(inputArr , leftSide , rightSide);

    }
    public void merge(int[] inputArr , int[] leftside , int[] rightside){
        int leftLength = leftside.length;
        int rightLength = rightside.length;
        int i  = 0 , k = 0 , j = 0;

        while (i < leftLength && j < rightLength){
            if(leftside[i] < rightside[j]) {
                inputArr[k] = leftside[j];
                i++;
            }
            else{
                inputArr[k]=  rightside[j] ;
                j++;
            }
            k++;
        }


        while(i < leftLength){
            inputArr[k]= leftside[i];
            i++;
            k++;
        }
        while(j < rightLength){
            inputArr[k] = rightside[j];
            j++;
            k++;
        }

    }






    public static void main(String[] args) {
        int[] s = {1,3,5425,542,2542,62,642,6246,426,42624,6246,247,77,1,9};
        System.out.println(Arrays.toString(s));
        new MERGESORT().mergeSort(s);
        System.out.println(Arrays.toString(s));
    }
}
