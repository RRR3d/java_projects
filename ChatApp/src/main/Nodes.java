package main;

public class Nodes <item>{
    private Node first;
    private Node last;
    private int size = 0;

    class Node{
        item item;
        Node next;
    }

    /**
     *  public void push(Item item)
     *      {  // Add item to top of stack.
     *         Node oldfirst = first;
     *         first = new Node();
     *         first.item = item;
     *         first.next = oldfirst;
     *         N++;
     * }
     * @param item
     */
    public void push(item item){
        Node tempNode = new Node();
       if(size == 0){
           tempNode.item = item;
           first = last = tempNode;
       }
       else{
           tempNode.item = item;
           last.next = tempNode;
           last = tempNode;
       }
       size++;
    }

    public void peek(){
        for(Node i = first ; i != null ; i = i.next){
            System.out.println(i.item);
        }
    }


    public void pop(){
       if(size == 0 ){
           System.out.println("EMPTYY!!");
       }
       else for(Node i = first ; i != null; i = i.next){
           if(i.next.next == last ){
               //i.next
           }
    }}



    public static void main(String[] args) {
       Nodes<Integer> nodes = new Nodes<Integer>();
       nodes.push(2);
       nodes.push(3);
       nodes.push(222);
       nodes.peek();
       nodes.pop();
        System.out.println(nodes.size + " ");
    }

}
