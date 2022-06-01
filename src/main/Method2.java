package main;

public class Method2 {
    public static void main(String[] args) throws Exception {

        int[] s = {2,3,4,5};
        int n = 6;
        if (n > s.length)
             throw new Exception("This Array has only 4 characters , Please enter chracter number 4");
        else
            System.out.println(s[n]);
}}
