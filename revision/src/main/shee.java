package main;

public class shee {
    // inner class
    public class Demo {
        private String name;
        private int number;

        public Demo(String name, int number) {
            this.name=name;
            this.number=number;
        }


        public void infoInnerClass() {
            System.out.println("Inner calss");
            System.out.println(name);
            System.out.println(number);
            System.out.println(city);
            System.out.println(price);
            System.out.println(add(2,3));
            System.out.println(mul(2,3));
        }

    } // end of the inner class

    private String city;
    private int price;

    public int add(int a, int b) {
        return a+b;
    }

    private int mul(int a, int b) {
        return a*b;
    }


    public void showInfoOuter() {

        System.out.println(price);
        System.out.println(city);
        Demo d= new Demo("Dolapder", 444);
        System.out.println(d.name);
        System.out.println(d.number);
        //d.infoInnerClass();

    }

    public void callB() {
        Demo d= new Demo("dd", 33);

    }
}
