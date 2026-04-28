package ss5_polymorphism;

import java.time.LocalTime;
import java.util.Scanner;

public class Teacher extends Person implements TimeKeeping, TimeKeeping2 {
    private double salary;

    public Teacher() {
    }

    public Teacher(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println("Teacher is working");
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();

        System.out.println("Enter salary: ");
        salary = Double.parseDouble(scanner.nextLine());
    }

    public void output() {
        super.output();
        System.out.println("Salary: " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public LocalTime checkin() {
        return LocalTime.of(8, 0, 0);
    }

    @Override
    public LocalTime checkout() {
        return TimeKeeping2.super.checkout();
    }
}
