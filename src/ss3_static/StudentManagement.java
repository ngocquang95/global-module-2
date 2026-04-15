package ss3_static;

import java.util.ArrayList;

public class StudentManagement {
    static ArrayList<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1, "John"));
        students.add(new Student(2, "Lily"));
    }

    static void main() {
        Student student = null;
        student.abc();
//        System.out.println(students.size());
//        Student s1 = new Student();
//        Student s2 = new Student();
//
//
//        System.out.println(s1.schoolName);
//        Student.schoolName = "School B";
//        System.out.println(s2.schoolName);
//        System.out.println(Student.schoolName);
    }
}
