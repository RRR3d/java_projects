package main;

public class MyLinkedList <Item>{

    private class node  {
        Item data;
        node next;
    }


    node lastNode;
    node firstNode;

    int size=  0;




    public void popRight(){
        node temp = new node();
        firstNode = firstNode.next;
    }

    public  void popLeft(){

        if(isEmpty()){
            System.out.println("YOUR ARE AN IDIOT");
        }
        if(firstNode.next == null ){
            firstNode = null;
            lastNode = null;
        }
        for(node x = firstNode ; x != null ; x = x.next){
            if(x.next == lastNode){
                lastNode = null;
                size--;
            }
        }

    }


    public void add1(Item element){
        node newNode = new node();
        newNode.data = element;
        if(isEmpty()){
            firstNode = newNode;
            lastNode = newNode;
        }
        else{
            newNode.next = firstNode;
            firstNode = newNode;
        }
        size++;
    }


    public boolean isEmpty(){
        return  firstNode == null;
    }

    /**
     *  Node oldfirst = first;
     *         first = new Node();
     *         first.item = item;
     *         first.next = oldfirst;
     *         N++;
     */
    public void addFromLast(Item element){
        node newNode = new node();

        if(isEmpty()){
            newNode.data=element;
            firstNode = newNode;
            lastNode = newNode;
        }
        else {
            newNode.data=element;
            lastNode.next = newNode;
            lastNode = newNode;
        }
        size++;
    }


    public void peek(){
        for (node i = firstNode ; i != null ; i = i.next){
            System.out.println(i.data);
        }
    }


    public void isHere(Item find){
        if(isEmpty()){
            System.out.println("EMPTy");
        }
        int counter = 0;
        for(node x = firstNode ; x != null ;x = x.next){
            counter++;
            if (x.data == find){
                System.out.println("its here: "+ counter);
            }
            else System.out.println("NOT HERE");
        }
    }
    public void remove(Item remove){
        node after = new node();
        if(isEmpty()){
            System.out.println("EMPTY!");
        }
        for(node x = firstNode ; x != null ; x = x.next){
            x.next = after;
            if(after.data == remove){
                x = after.next;
            }
        }
    }



    public static void main(String[] args) {
        MyLinkedList <Integer>m = new MyLinkedList();
        m.add1(3);
        m.peek();
        m.addFromLast(333);
        m.addFromLast(2);
        m.peek();

       // m.popLeft();
       // m.isHere(3941);
       // m.remove(10);
        System.out.println("REMOVED");
        m.peek();
    }
}
