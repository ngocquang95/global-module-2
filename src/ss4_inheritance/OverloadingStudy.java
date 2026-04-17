package ss4_inheritance;

public class OverloadingStudy {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double add(double a, double b, double c) {
        return a + b + c;
    }

    // 4, 5, 6, ...
    public static double add(double... arr) {
        double total = 0;
        for (double value : arr) {
            total += value;
        }
        return total;
    }

    static void main() {
        System.out.println(add(1, 2));
    }
}
