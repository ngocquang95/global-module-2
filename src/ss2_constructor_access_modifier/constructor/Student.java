package ss2_constructor_access_modifier.constructor;

import util.InputUtil;

public class Student {
    private int id;
    private String name;
    private double score;

    public Student() {
    }

    public Student(double score, String name, int id) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    void input() {
        System.out.print("Enter id: ");
        this.id = Integer.parseInt(InputUtil.scanner.nextLine());

        System.out.print("Enter name: ");
        this.name = InputUtil.scanner.nextLine();

        System.out.print("Enter score: ");
        score = Double.parseDouble(InputUtil.scanner.nextLine());
    }

    void output() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
