package main;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {

        int[][] a = { {1,1}  , {1,1} };
        arrays arrays = new arrays();
       // arrays.print(a);
        int[][] b = { {1,1}  , {1,1}};
        System.out.println(arrays.add(a,b));


    }



     public void print(int[][] a){


        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.println();


    }

    }





    public int add(int[][] a  , int [][] b){
        int [][] full = new int[ a.length  ][  a[0].length    ];
        int sum= 0;
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                sum = sum + (a[i][j] +b[i][j]);
            }
        }
        return sum;
    }



    public int avg(int[][] a  , int [][] b){
        //int [][] full = new int[ a.length  ][  a[0].length    ];
        int sum= 0;
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                sum = sum + (a[i][j] +b[i][j]);
            }
        }
        return sum / a.length;
    }





}
