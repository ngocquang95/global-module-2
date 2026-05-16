package ss8_set_map;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Practice {
    static void main() {
//        Set<Student> set = new HashSet<>();
//
//        set.add(new Student(1, "John", 9.6));
//        set.add(new Student(1, "John", 9.6));
//
//        System.out.println(set.size());

        Set<Integer> set = new LinkedHashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println(set);
    }
}
