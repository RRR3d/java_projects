package main;

public class Man {
    private String name;
    public Man(){
    }
    public Man(String name){
        this.name = name;
    }
    public String getName(){
        return  name;
    }
    public void setName(String name ) {
        this.name = name;
    }


    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                '}';
    }
}
