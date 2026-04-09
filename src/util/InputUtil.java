package util;

import java.util.Scanner;

public class InputUtil {
    public static Scanner scanner = new Scanner(System.in);

    public static int inputPositive(String target) { // target = column
        int n;
        do {
            System.out.printf("Enter number of %s (%s > 0): ", target, target);
            n = Integer.parseInt(scanner.nextLine());

            if (n < 0) {
                System.out.printf("%s must be > 0, please type again!", target);
            }
        } while (n < 0);
        return n;
    }
}
