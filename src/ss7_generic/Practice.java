package ss7_generic;

import ss3_static.Student;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    static void main() {
        List<Integer> integers = new ArrayList<>();

        integers.add(10);

        int[] arr = new int[10];

        // cal sum
        int total = 0;
        for (Integer item : integers) {
            total += item;
        }
    }
}
