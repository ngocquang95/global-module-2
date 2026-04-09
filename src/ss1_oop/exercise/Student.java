package ss1_oop.exercise;

import util.InputUtil;

import java.util.Scanner;

public class Student {
    int id;
    String name;
    double score;

    void input() {
        System.out.print("Enter id: ");
        id = Integer.parseInt(InputUtil.scanner.nextLine());

        System.out.print("Enter name: ");
        name = InputUtil.scanner.nextLine();

        System.out.print("Enter score: ");
        score = Double.parseDouble(InputUtil.scanner.nextLine());
    }

    void output() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
    }
}
