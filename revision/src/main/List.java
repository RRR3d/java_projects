package main;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class List {

    public int[] array(int [][] a){
        int [] b = new int[a.length];

        for(int i = 0 ; i < a.length ; i++){
            for (int j = 0 ; j < a[0].length ; j++){
                if ( a[i][j] %2 == 0){
                    b[i] = a[i][j];
                }

            }

        }
        return b;
    }

    public static void main(String[] args)  throws Exception {
        int[][]  a = { {1,4} ,{56,6} ,{7,8}};
        List m = new List();
        System.out.println(Arrays.toString(m.array(a)));
            FileWriter fw = new FileWriter(
                    "/Users/abdo/Documents/GitHub/java_projects/revision/src/main/dima.txt");
            BufferedWriter bf = new BufferedWriter(fw);
            bf.write("jdij");
            bf.close();
            FileReader fr = new FileReader("/Users/abdo/Documents/GitHub/java_projects/revision/src/main/dima.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line =br.readLine())!=null){
                System.out.println(line);
            }
            br.close();


    }
}
