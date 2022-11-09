package main;

class FixedCapacityStack<T> {
    private T[] a; // stack entries
    private int N; // size

    public FixedCapacityStack(int cap) {
        a = (T[]) new Object[cap];
    }


    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void push(T item) {
        a[N++] = item;
    }

    public T pop() {
        return a[--N];
    }
}