package main;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//findOccurances10();

    }

    public static int findOccurances10(String filename){
        int count = 0;
        try {
            File  f  = new File(filename);
            FileInputStream fis = new FileInputStream(f);
            Scanner scan = new Scanner(fis);

            while(scan.hasNext()) {
                if (scan.next() == "10" )
                    count++;
                System.out.println(scan.next());
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return  count;
    }
}
