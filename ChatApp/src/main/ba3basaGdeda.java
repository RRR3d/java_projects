package main;

import java.util.Arrays;

public class ba3basaGdeda {

    static class Stack<item> {
        private item[] ItemArr ;
        private item item;
        private Stack next;
        int N ;
        private  int size;


        public Stack(int size){
            this.size = size;
            ItemArr = (item[]) new Object[size];
        }

        public void push(item t ){
           ItemArr[N] = t;
           N++;
        }

        public void pop(){
            ItemArr[--N] = null;



        }

        public void peek(){
            int J = 1;
            for(int i = 0 ; i < N ; i ++){
                System.out.println(ItemArr[i] + "  ITEM Number:"  );
            }
        }

        /**
         *
         public void deQ(){
         System.out.println(Item_arr[0] + " GOT OUT");
         Item_arr[0] = null;
         for(int i = 0; i < n ; i++){
         Item_arr[i] = Item_arr[i+1];
         }
         n--;
         }
         */

        public void DeQ(){
            ItemArr[0] = null;
            N--;

            for(int i = 0 ; i <ItemArr.length-1 ; i++){
                ItemArr[i] = ItemArr[i+1];
            }
        }


        public void reSize(){
            if(size >= N*2){
                size = size/2;
            }

        }



    }


    public static void main(String[] args) {

        Stack<String> s = new Stack<>(10);
        s.push("string1");
        s.push("string2");
        s.push("string3");
        s.push("string4");
        System.out.println(Arrays.toString(s.ItemArr));

        System.out.println(s.size);
        s.reSize();
        System.out.println(s.size);

        s.pop();


        s.DeQ();
        s.peek();





    }







}
