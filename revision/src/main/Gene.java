package main;

public class Gene <T, S>  {
    T obj1;
    S obj2;
    public Gene(T obj1 , S obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    public Gene(){}

    public void PRINT(){
         System.out.println(obj1);
        System.out.println(obj2);
    }

    public static void main(String[] args) {
        Gene<String , Integer> g  = new Gene("Somthing " , 230);
        g.PRINT();


    }

}
