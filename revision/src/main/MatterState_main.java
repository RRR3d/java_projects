package main;

import java.util.ArrayList;
import java.util.Scanner;

public class   MatterState_main {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    String s = null;
    ArrayList<WaterState> wsList = new ArrayList<>();
        WaterState waterState= new WaterState();
        while ( s != "x"){
        System.out.println("Type The data temp: if you want to exit please type X ");
        s =input.nextLine().toUpperCase();
        if(s.indexOf( "C") > 0){
            String split = s.split("C").toString();
           // WaterState ws1 = new WaterState(split , true);

        }
        else if (s.indexOf( "F") > 0){
            String split = s.split("F").toString();

        }
    }

}

}
