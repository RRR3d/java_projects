package main;

import java.util.Arrays;

public class Studying<T> {

    public void MergeSorting(int[] arr){
        int size = arr.length;
        int mid = size/2;

        int[] left = new int[mid];
        int[] right = new int[size -mid];

        for(int i = 0; i < mid ; i++){
            left[i] = arr[i];
        }
        for(int i =mid ; i < size ; i++){
            right[i - mid ]  = arr[i];
        }

        MergeSorting(left);
        MergeSorting(right);
        merge(left , right , arr );
    }

    public void merge(int[] left , int[] right , int[] arr){
        int i =0, j=0, k = 0;
        while(left.length > i && right.length > j ){

            if(left[i] > right[j]){
                arr[k] =left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while(left.length > i ){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(right.length > j){
            arr[k] = right[j];
            j++;
            k++;
        }


    }

    public static void main(String[] args) {
        int[] arr = {314,4315316,13,613,631,6,136,316,31,6,136,13,6316,13};
        new Studying().MergeSorting(arr );
        System.out.println(Arrays.toString(arr));
    }
}
