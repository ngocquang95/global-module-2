package ss6_collection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Practice2 {
    static void main() {
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println(set);
    }
}
