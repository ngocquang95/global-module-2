package ss2_constructor_access_modifier.constructor;

public class StudentManagement {
    static void main() { // JDK >= 25
//        Student student = new Student(10, "John", 3.6);
//      //  Double x = null;
//        Student s2 = new Student((Double) null);
//
//
//
////        Student student = new Student(1, "John", 6.5);
////
//        student.output();

        Student student = new Student();
        student.setName("John");
        System.out.println(student.getName());

    }


}
