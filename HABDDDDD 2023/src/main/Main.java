package main;
import java.util.Arrays;
import java.util.LinkedList;

class Main {
    /*

    public static  int[]  insertNewValueToArray( int[] array , int num , boolean isTrue  ) {

        int[] newArray = new int[array.length+1];
        int i;

        if(isTrue == true) {
            for (i = 0; i < N; i++) {
                newArray[i] = array[i];
            }
            newArray[i] = num;
        }

        if(isTrue == false){
            for(i = array.length ; i != 0 ; i--){
                newArray[i] = array[i-1];
            }
            newArray[0] = num;
        }

        return newArray;

    }

    public static int[] removeValueFromArray( int[ ] array , boolean isTrue){
        int[] newArray = new int[array.length];

    }

    public static void main(String[] args) {

        int[] a= { 1,2,3,4,5,6};
        System.out.println(Arrays.toString(insertNewValueToArray(a, 9, true)));
        System.out.println(Arrays.toString(insertNewValueToArray(a, 9, false)));


     */





    /*
        public static int evaluateExpression(String expr) {

            // Split every symbol in parameter expr to an independent string
            String[] symbolsInExpr = expr.split("");

            Stack<String> ops  = new Stack<String>();
            Stack<Integer> vals = new Stack<Integer>();

            while (!expr.isEmpty()){

            }



        }

        public static void main(String[] args) {
            String s = "((1 + 2) + (3 + 4))";
            int x = evaluateExpression(s);
            System.out.printf("%s = %d\n",s,x);

            s = "(7 - (5 * 2))";
            x = evaluateExpression(s);
            System.out.printf("%s = %d\n",s,x);

            s = "(((1 * 2) * 3) * 5)";
            x = evaluateExpression(s);
            System.out.printf("%s = %d\n",s,x);
        }

     */


    public static int evaluateExpression(String expr) {

        // Split every symbol in parameter expr to an independent string
        String[] symbolsInExpr = expr.split("");
        // Create a stack for strings
        FixedCapacityStack<String> ops = new FixedCapacityStack<String>(symbolsInExpr.length);
        // Create a stack for integers

        FixedCapacityStack<Integer> vals = new FixedCapacityStack<Integer>(symbolsInExpr.length);

        for(int i= 0 ; i < symbolsInExpr.length ; i ++){
             if(symbolsInExpr[i].equals( "(")) {}
             else if(symbolsInExpr[i].equals( " ")) {}
             else if(symbolsInExpr[i].equals( "+") )ops.push("+");
             else if(symbolsInExpr[i].equals("-")) ops.push("-");
             else if(symbolsInExpr[i].equals("*")) ops.push("*");
             else if(symbolsInExpr[i].equals("/")) ops.push("/");
             else if(symbolsInExpr[i].equals(")")) {
                 String op = ops.pop();
                 int v = vals.pop();
                 if (op.equals("+")) v = vals.pop() + v;
                 else if (op.equals("-")) v = vals.pop() - v;
                 else if (op.equals("*")) v = vals.pop() * v;
                 else if (op.equals("/")) v = vals.pop() / v;
                 vals.push(v);}
        else
            vals.push(Integer.parseInt(symbolsInExpr[i]));
            }
        return vals.pop();
        }


    public static void main(String[] args) {
        String expr = "(1 + 2) + 3 - 3";
        String[] symbolsInExpr = expr.split("");
        System.out.println(Arrays.toString(symbolsInExpr));
        for(int i = 0 ; i < symbolsInExpr.length ; i++){
            System.out.println(symbolsInExpr[i]);
        }

        String s = "((1 + 2) + (3 + 4))";
        int x = evaluateExpression(s);
        System.out.printf("%s = %d\n",s,x);


        String[] sa = {"*****************"};
        Arrays.stream(sa).spliterator("*");
        System.out.println(sa.length);
        


    }

    }
