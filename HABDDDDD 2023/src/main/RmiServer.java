package main;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RmiServer {
    public static void main(String[] args) throws  Exception {
        System.setProperty("Java" , "localhost");
        RmiService r1 = new RmiService("First");
        RmiService r2 = new RmiService("2nd");
        RmiService r3 = new RmiService("3rd");

        CalcInterface stub1 = (CalcInterface) UnicastRemoteObject.exportObject(r1, 0);
        CalcInterface stub2 = (CalcInterface) UnicastRemoteObject.exportObject(r2, 0);
        CalcInterface stub3 = (CalcInterface) UnicastRemoteObject.exportObject(r3, 0);

        Registry reg = LocateRegistry.getRegistry("localhost" , 1177);
        reg.rebind("1st" , stub1);
        reg.rebind("2nd" , stub2);
        reg.rebind("3rd" , stub3);

    }
}
