package ss7_generic;

import java.util.Stack;

public class Practice3 {
    static void main() {
        Stack<Integer> stack = new Stack<>();

        int n = 6;

        while (n != 0) {
            stack.push(n % 2);
            n /= 2;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
