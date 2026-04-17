package ss4_inheritance;

import java.util.Scanner;

public class Teacher extends Person {
    private double salary;

    public Teacher() {
    }

    public Teacher(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
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
}
