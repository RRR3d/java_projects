package main;

public class DoubleEndedQ <Item> {


    Item[] items;
    int count=0;
    int size;
    public DoubleEndedQ(int size ){
        this.size = size;
        items =  (Item[]) new Object[size];
    }

    public void addRight(Item item){
        items[count] = item;
        count++;
    }


    private class node{
        Item data;
        node next;
    }
    node firstNode;
    node LastNode;

    public void addtoNode(Item data){

        if(firstNode== null){
            firstNode.data = data;
        }

    }
    /**
     * if(N==data.length) resize();
     * for(int i = N;i>0;i--)data[i]=data[i-1]; data[0] = newValue;
     * N++;
     */
    public void addLeft(Item item){

        for (int i = count ;i >0 ; i--){
            items[i] = items[i-1];
        }
        count++;
        items[0] = item;

    }

    public void print(){
        for(int i = 0 ; i < items.length ; i++){
            System.out.println(items[i]);
        }
    }

    public static void main(String[] args) {
        DoubleEndedQ<Integer> d = new DoubleEndedQ(10);
        d.addRight(1);
        d.addRight(2);
        d.addRight(3);
        d.addLeft(10);


        System.out.println(d.count + " SIZE IS "  + d.size);
        d.print();
    }


}
