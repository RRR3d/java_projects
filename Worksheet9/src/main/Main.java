package main;

import java.util.ArrayList;
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
        ArrayList<String> alist = new ArrayList<>();
        alist.add("SOSO");
        alist.add("KOKO");
        alist.add("MOMO");
        ArrayList<Integer> num1 = new ArrayList<Integer>();
        num1.add(1);
        num1.add(2);
        num1.add(3);

        ArrayList<Integer> num2 = new ArrayList<Integer>();
        num2.add(1);
        num2.add(2);
        num2.add(3);


        Main m = new Main();
        // METHOD 1
        m.numberIT(alist);
        // Method 2
        m.addNumbers();
        // Method 3
        m.addArrays(num1 , num2);
        // METHOD 4
        m.Fruits(alist);
    }
}
