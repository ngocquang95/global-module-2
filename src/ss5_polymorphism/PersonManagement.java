package ss5_polymorphism;

import java.util.ArrayList;

public class PersonManagement {
    static void main() {
//        Student s1 = new Student(1, "John", 6.5);
//        Student s2 = new Student(1, "John", 6.5);
//        // System.out.println(s1.equals(s2)); // true
//
//        System.out.println(s1.toString());
//        System.out.println(s1);

        double x = 2.5;
        int i = (int) x;

        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Student(1, "Jonh", 6.5));
        personArrayList.add(new Teacher(2, "Lily", 5000));

        // if student => show method run
        for(Person person : personArrayList) {
            person.work(); // student is working | teacher is working
            if(person instanceof Student) {
                ((Student) person).run(); // student is running
            }
        }
    }
}
