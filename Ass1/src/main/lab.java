package main;

class CollectionWithLinkedList<T> {
    private Node first; // top of stack

    private class Node {
        T item;
        Node next;
    }

    public void delete( int k ){
        if(k == 0){
            first = first.next;
        }
        else{
            Node node = first;
            Node  node2;
            for(int i=0; i< k-1 ; i++){
                node= node.next;
            }
            node2 = node.next;
            node.next =node2.next;
        }
    }

    public void Delete(int k){
        int count = 0;
        if(k == 0){
            Node node = first;
            Node node2;
            for(int i=0 ; i < (k-1); i++){
                node = node.next;
            }

        }
    }
    public static void main(String[] args) {

    }

    public void insertValue(T val) {
        Node oldFirst = first;
        first = new Node();
        first.item = val;
        first.next = oldFirst;
    }

    public String toString() {
        String s = "";
        for(Node x = first;x!=null;x=x.next) s=s+" "+x.item.toString();
        return s;
    }

}



