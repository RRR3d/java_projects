package main;

public class ship extends  Vehicle{
    private String PropeloierType;
    public ship(){}
    public ship(Man man , double price , String PropeloierType){
        super(man , price);
        this.PropeloierType = PropeloierType;
    }

    public String getPropeloierType() {
        return PropeloierType;
    }

    public void setPropeloierType(String propeloierType) {
        PropeloierType = propeloierType;
    }
}
