package ss6_collection;

import java.util.Arrays;

public class MyArrayList {
    private int capacity;
    private int[] data;
    private int size;

    private int[] emptyArray = {};

    public MyArrayList() {
        data = emptyArray;
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        this.data = new int[capacity];
    }

    public void add(int value) {
        if (this.data == emptyArray) {
            this.capacity = 10;
            this.data = new int[this.capacity];
        }

        if (capacity == size) {
            capacity = (int) (1.5 * capacity);

            int[] arr = new int[capacity];

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
