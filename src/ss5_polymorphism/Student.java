package ss5_polymorphism;

import java.util.Objects;
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
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(score, student.score) == 0;
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %s", super.getId(), super.getName(), this.getScore());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(score);
    }

    @Override
    public void work() {
        System.out.println("Student is working");
    }

    public void run() {
        System.out.println("Student is running");
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
