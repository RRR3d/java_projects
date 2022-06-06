package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

// ********************************************  Q4   *************************************************

public class getData {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner inputFile = new Scanner(new File("/Users/abdo/Documents/GitHub/java_projects/HomeWork4/src/main/Q4.txt"));

        double sum = 0;
        int n = 0;

            while (inputFile.hasNext()) {
                n++;
                sum += inputFile.nextDouble();
            }
        inputFile.close();
          // inputFile.close();
            double avg = sum / n;
        Scanner inputFile2  = new Scanner(new File("/Users/abdo/Documents/GitHub/java_projects/HomeWork4/src/main/Q4.txt"));

        double r;
            double num;
            double sum2 = 0;
            while (inputFile2.hasNext()) {
                r = inputFile2.nextDouble();
                sum2 += pow((r - avg), 2);
            }

            inputFile2.close();
            double SD = sqrt(sum2 / (n - 1));
        System.out.println("THIS IS SUM1 " +sum);
        System.out.println("THIS IS SUM2 " + SD);

        }


    }

