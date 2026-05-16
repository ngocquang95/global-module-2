package ss8_set_map;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Practice2 {
    static void main() {
        Set<Student> set = new TreeSet<>(new ScoreByIdAndScoreStudentComparator());
        set.add(new Student(1, "John", 9.6));
        set.add(new Student(2, "John 2", 8.6));
        set.add(new Student(3, "John 3", 8.6));
//        set.add(10);
//        set.add(50);
//        set.add(40);
//        set.add(20);
//        set.add(30);
        System.out.println(set);
    }
}
