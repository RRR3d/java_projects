package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

// ********************************************  Q4   *************************************************

public class getData {
    public static void main(String[] args) throws FileNotFoundException {

        // READ DATA FROM FILE
        Scanner scannerFILE = new Scanner(new File("/Users/abdo/Documents/GitHub/java_projects/HomeWork4/src/main/Q4.txt"));


        int NUMBER = 0; // INT NUMBER
        double aNUM = 0; // DOUBLE NUMBER
            while (scannerFILE.hasNext()) { // WHILE LOOP
                NUMBER++; // COUNT HTE NUMBER
                aNUM += scannerFILE.nextDouble(); // ANUM + THE NUM
            }
        scannerFILE.close();
          // scannerFILE.close();
            double AVARAGE = aNUM / NUMBER;
        Scanner scannerFILE2  = new Scanner(
                new File("/Users/abdo/Documents/GitHub/java_projects/HomeWork4/src/main/Q4.txt"));



            double RESULT_2 = 0;      // THE RESULT INITAILAIZAITON

            double numX;     // THE NUM DOUBLE

            while (scannerFILE2.hasNext()) {  // WHILE LOop
                numX = scannerFILE2.nextDouble();
                RESULT_2 += pow((numX - AVARAGE), 2);
            }

            scannerFILE2.close();  // CLOSE THE SCANNER
            double LASTRESULT = sqrt(RESULT_2 / (NUMBER - 1));  // CALCULATION
        System.out.println("the first aNUM is " +aNUM + "the second aNUM is " + LASTRESULT);  // PRINT HTE CALCULATIUON


        }


    }

