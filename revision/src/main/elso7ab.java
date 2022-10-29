package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class elso7ab {
    public static void main(String[] args) throws Exception {
        File file = new File("/Users/abdo/Documents/GitHub/java_projects/revision/src/main/Raghad.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bfw = new BufferedWriter(fw);
        bfw.close();



        elso7ab e = new elso7ab();
        ArrayList<String> a = new ArrayList<>();
        a.add("soso");
        a.add("kjoko");
        ArrayList<Integer> aa =new ArrayList<>();
        aa.add(2);
        aa.add(3);
        e.printer(a);
        e.printer(aa);


        int[] list= new int[5];


    }

    public <T> void  printer(ArrayList<T> c){
        for(int i =0 ; i < c.size() ; i++){
            System.out.println(c.get(i));
        }

    }

}
