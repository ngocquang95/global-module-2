package ss6_collection;

import java.util.Arrays;

public class MyArrayList<E> {
    private int capacity;
    private Object[] data;
    private int size;

    private Object[] emptyArray = {};

    public MyArrayList() {
        data = emptyArray;
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        this.data = new Object[capacity];
    }

    public void add(E value) {
        if (this.data == emptyArray) {
            this.capacity = 10;
            this.data = new Object[this.capacity];
        }

        if (capacity == size) {
            capacity = (int) (1.5 * capacity);

            Object[] arr = new Object[capacity];

            for (int i = 0; i < data.length; i++) {
                arr[i] = data[i];
            }

            data = arr;
        }

        data[size] = value;
        size++;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < size; i++) {
            stringBuilder.append(data[i]).append(" \t");
        }

        return stringBuilder.toString();
    }
}
