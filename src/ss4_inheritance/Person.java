package ss4_inheritance;

import java.util.Scanner;

public class Person {
    private int id;
    private String name;

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter id: ");
        id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter name: ");
        name = scanner.nextLine();
    }

    public void output() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
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
