package main;

public class Main {

    public static void main(String[] args) {
	// Binary Search
        int[] arr= {3,135,5,5,,51,3,13,3,15,315,315,13,513,51,51,35,135,13,5,13,123}
        BinarySearch(arr , 13);
    }



    public staitc int BinarySerach(int[] arr , int target){
        lo = 0;
        hi = arr.length -1;

        while ( lo < hi ){

            mid = lo + (hi-lo) -1 ;
            value = arr[mid];

            if(targe > arr[mid]) lo = mid +1;
            else if(targe < arr[mid]) hi = mid -1;
            else return mid;
        }
        return -1;
    }
}
