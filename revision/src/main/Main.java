package main;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        
        int x=0;
	switch (x){
        case 1:
            System.out.println(1);
            break ;
        case 2 :
            System.out.println(2);
            break;
        case 3 :
            System.out.println(3);
            break;
        default:
            System.out.println(00);
    }

    // 3 7 ,  5 14 . 3 12
//        for(int i = 3 ; i <= 7; i++){
//            System.out.println(i);}


        // WORKSHEET 3
        int counts=0;
        int dice  = 0;
        while (dice != 6){
             dice = (int) (Math.random() * 6 +1);
            System.out.println(dice);
             if ( dice == 3 )
                 counts ++;

        }
        System.out.println(" numbers of three " +counts);


            for ( int j = 6 ; j > 0 ; j--){
                System.out.println();
                for(int i = 6 ; i  > 0 ; i--){
                    System.out.print("* ");
            }}





}

   public static class Warrior{
        private String name;
        private int health ;
        private int Strength;
        public Warrior(){
            this.name = name;
            this.health = health;
            this.Strength = Strength;
        }

        public void setName(String name){
            this.name = name;
        }
        public int getHealth(){
            return health;
        }
        public void setHealth(int health ){
            this.health = health;
        }
        public int getStrength(){
            return Strength;
        }

       public void setStrength(int strength) {
           Strength = strength;
       }

       public String toString(){
            return Strength + health + name;
       }
   }

}
