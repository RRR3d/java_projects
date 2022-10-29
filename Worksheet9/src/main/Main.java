package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public void numberIT (ArrayList<String> a){

        int s = 1;
        for ( int i = 0 ; i < a.size() ; i++ ){
            a.set(i , s + ": "+ a.get(i)) ;
            s++;
        }
        System.out.println(a);
    }
    public void addNumbers() {
        ArrayList<Integer> a = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int s = 0;

        int num;
        do {
            System.out.println("ADD NUMBERS TO ARRAYLIST, 0 to exit: ");
            num = input.nextInt();
            a.add(num);
        } while (num != 0);

        System.out.println(a);
    }
    public void addArrays(ArrayList<Integer> a , ArrayList<Integer> b){
        int sum = 0 ;
        sum = a.size() + b.size();
        System.out.println( "The sum of the length is: "  +sum);
    }
    public void Fruits (ArrayList<String> a ){
        Scanner input = new Scanner(System.in);
        System.out.println("Search for a word: ");
        String word = input.nextLine();
        if (a.contains(word)){
            System.out.println("WORD IS IN THE ARRAY");
        }
        else
            System.out.println("WORD IS NOT IN THE ARRAY");
    }





    public static void main(String[] args) {
        Main m = new Main();
        int[][] s = {{2,3} ,{3,4},{5,4}};
        int[] k = {1,2,3};
      //  System.out.println(Arrays.toString(m.arr(s,k)));

        int p =3;
        System.out.println("p" + p + p);
    }

    public int[][] arr(int[][] t , int[] m){
        int [][] D = new int[t.length][t[0].length];
        int j= 0;
        for(int i = 0 ; i < t.length ; i++) {
            D[i][j] = t[i][j] + m[i];
            if (t.length == m.length){
                j++;
        }

        }

        return D;
    }
}
