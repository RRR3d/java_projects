package main;

import java.util.ArrayList;
import java.util.Scanner;

public class WaterState {
    private double waterTemp;
    private  boolean isCelcies ;
    public void WaterState(String Temp) {
    }
    public WaterState(double waterTemp, boolean isCelcies){
        this.waterTemp = waterTemp;
        this.isCelcies = isCelcies;
    }
    public WaterState(){}

    public MatterState getState(){
        MatterState m = new MatterState();
        return m;
    }
}
