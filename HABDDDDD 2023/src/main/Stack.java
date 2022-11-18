package main;


public class Stack<T> {

    private Node firstNode;
    private class Node {
        T item;
        Node next;
    }

    public String  convertFromLinkedListToString() {
        String SSTRING = "";
        for (Node x = firstNode; x != null; x = x.next)
        {
            SSTRING  += x.item;
        }

        return SSTRING;

    }



    public void  push(T  t ){

        Node OOLDNODE = firstNode;
        firstNode = new Node();

        firstNode.item = t;
        firstNode.next = OOLDNODE;

    }



    public static void main(String[] args) {

        Stack<Integer> s = new Stack<Integer>();
        s.push(3);
        s.push(5);
        s.push(7);
        s.push(9);
       // System.out.println(s.convertFromLinkedListToString());
        System.out.printf("%s\n",s.convertFromLinkedListToString());

        Stack<String> s2 = new Stack<String>();
        s2.push("abc");
        s2.push("def");
        s2.push("ghi");
        System.out.printf("%s\n",s2.convertFromLinkedListToString());

    }

}