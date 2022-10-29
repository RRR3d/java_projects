package main;

import java.io.*;
import java.util.Scanner;

public class main1 {
    public static void main(String[] args) throws  Exception{
        outer outer = new outer();
        outer.inner inner = outer.new inner();
        inner.hifromInner();

        outer.localInner();
        Scanner input = new Scanner(System.in);


        File file = new File("/Users/abdo/Documents/GitHub/java_projects/revision/src/main/new.txt");

        FileWriter  fw = new FileWriter(file);
        BufferedWriter bs = new BufferedWriter(fw);
        fw.write("no");



        FileReader fr = new FileReader(file);
        System.out.println( (char) fr.read() + " this is it");
        BufferedReader bf = new BufferedReader(fr);
        String line;



        while((line = bf.readLine())  != null){
            bs.write(line + ".");
        }
        fw.close();
            fr.close();

        FileOutputStream fo = new FileOutputStream(file);

        fo.write("some stuff22".getBytes());
        fo.close();

        FileInputStream fi = new FileInputStream(file);
        System.out.println((char)fi.read());
        System.out.println((char)fi.read());
        System.out.println((char)fi.read());
        System.out.println((char)fi.read());
        System.out.println((char)fi.read());




    }
}
