package main;

public class cat extends Animal implements interfaces{
    @Override
    public void makenoise() {
        System.out.println("meaw");
    }

    @Override
    public void poop() {
        super.poop();
    }

    @Override
    public void printwify() {

    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal() {

            public void makenoise() {

            }
        };
    }
}
