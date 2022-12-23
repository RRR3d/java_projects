package main;

import java.rmi.Remote;

public interface CalcInterface extends Remote {
    public int add(int a , int b) throws Exception;
    public String getName() throws Exception;
}
