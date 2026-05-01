package ss6_collection;

import java.util.LinkedList;
import java.util.List;

public class Practice {
    static void main() {
        List<Integer> integers = new LinkedList<>();

        integers.add(10);
        integers.add(10);
        integers.add(20);
        integers.add(30);
        integers.add(40);

        System.out.println(integers);
    }
}
