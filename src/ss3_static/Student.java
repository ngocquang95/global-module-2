package ss3_static;

public class Student {
    private int id; // Global
    private String name; // Global
    public static String schoolName = "School A"; // static
    static double score = 200;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void abc() {
        int x = 2; // Local
//        System.out.println(score);
//        double score = 100;
//        System.out.println(score);
        System.out.println("Hello");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
