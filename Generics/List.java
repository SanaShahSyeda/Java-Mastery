package Generics;

public class List {
    // private int count;
    // private int[] items = new int[10];

    // public void add(int item) {
    // items[count] = item;
    // }

    // public int get(int index) {
    // return items[index];
    // }

    // Solution 1
    private Object[] items = new Object[10];
    private int count;

    public void add(Object item) {
        items[count++] = item;
    }

    public Object get(int index) {
        return items[index];
    }
}
