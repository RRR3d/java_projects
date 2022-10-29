package main;

public class outer {
    // NORAML METHOD
    public void hello(){
        System.out.println("hello");
    }

    // INNER CLASS
    public class inner{
        public void hifromInner(){
            System.out.println("Hi from inside");
        }
    }


    // NORMAL METHOD
    public void localInner(){
        System.out.println("WEllcome from deep");
        // LOCAL INNER
         class localInner1{
             // LOCAL INNER METHOD
             public void innerInnerInner(){
                 System.out.println("wellcome from so deep inside you");
             }
        }


        // CALLING THE CLASS
        localInner1 deepInside = new localInner1();
         deepInside.innerInnerInner();
    }

}

 class test {
    public static void main(String[] args) {
        outer o = new outer();
        outer.inner inner = o.new  inner();

    }
}
