package ss1_oop.exercise;

import util.InputUtil;

import java.util.ArrayList;

public class StudentManagement {
    static void main() { // JDK >= 25
        // ArrayList
        // Step 1: input n
        int n = InputUtil.inputPositive("n");

        ArrayList<Student> students = new ArrayList<>();

        // Step 2: input n students
        Student student;
        for (int i = 1; i <= n; i++) {
            student = new Student();
            System.out.printf("Enter the information for the %d%s student\n\n", i, getRole(i));
            student.input();
            students.add(student);
        }

        // 1 - st
        // 2 - nd
        // 3 - rd
        // 4 - th
        // Step 3: output n students
        for (int i = 1; i <= n; i++) {
            System.out.printf("Information for the %d%s student\n\n", i, getRole(i));
            students.get(i - 1).output();
        }
//        Student s1 = new Student();
//        Student s2 = new Student();
//
//        System.out.println("Input student first student");
//        s1.input();
//        System.out.println("Input student second student");
//        s2.input();
//
//        System.out.println("Information of first student");
//        s1.output();
//        System.out.println("Information of second student");
//        s2.output();
    }

    static String getRole(int order) {
        return switch (order) {
            case 1 -> "st";
            case 2 -> "nd";
            case 3 -> "rd";
            default -> "th";
        };
    }
}
