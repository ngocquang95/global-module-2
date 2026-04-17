package ss4_inheritance;

import java.util.Scanner;

public class Student extends Person {
    private double score;

    public Student() {
        super(); // call constructor of parent
    }

    public Student(int id, String name, double score) {
        super(id, name);
        this.score = score;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();

        System.out.println("Enter score: ");
        score = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Score: " + score);
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
