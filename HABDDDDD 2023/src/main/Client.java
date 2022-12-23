package main;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) throws Exception {
        Registry reg = LocateRegistry.getRegistry("localhost" , 1177);
        CalcInterface c1 =(CalcInterface) reg.lookup("1st");
        CalcInterface c2 =(CalcInterface) reg.lookup("2nd");
        CalcInterface c3 =(CalcInterface) reg.lookup("3rd");
        System.out.println(c1.getName());
        System.out.println(c1.add(1,0));
        System.out.println(c2.getName());
        System.out.println(c2.add(1,1));


    }
}
