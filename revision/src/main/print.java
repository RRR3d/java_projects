package main;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class print {
    public <T> void sPrint(T something)
    {
        System.out.println(something);
    }



    public static void main(String[] args) throws Exception {

        Question q = new Question();
        System.out.println(q.a);
//        q.ar.add(10);
//        q.ar.add(300);
            q.ar.add(new Question());
            ArrayList<Integer> aar = new ArrayList<>();



        PrintWriter pw = new PrintWriter(new File("a.txt"));

        pw.println("faoa");

        print p1 = new print();
        p1.read("/Users/abdo/Documents/GitHub/java_projects/revision/src/main/new.txt");

        File fff =  new File("soso.txt");
        FileInputStream fin = new FileInputStream(fff);
        Scanner sosos = new Scanner(fin);
        while (sosos.hasNext()){

        }


    }

    public void printlist(ArrayList<? > something ){
        System.out.println(something);

    }

    public void read(String filename) throws  Exception{
        File file  = new File(filename);
        FileReader fr = new FileReader(file);
        BufferedReader frr = new BufferedReader(fr );
        String line ;
        int t = 0;
        while((line =  frr.readLine()) != null){
            t += Integer.valueOf(line);
        }
        System.out.println(t);
    }
}
