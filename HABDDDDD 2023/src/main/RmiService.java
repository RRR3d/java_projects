package main;

public class RmiService implements CalcInterface{

    String name;

    public RmiService(String name){
        this.name = name;
    }
    @Override
    public int add(int a, int b) throws Exception {
        return a+b;
    }

    @Override
    public String getName() throws Exception {
        return name;
    }
}
