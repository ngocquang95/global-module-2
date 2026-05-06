package ss7_generic;

import java.util.Stack;

public class Practice2 {
    static void main() {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        //step 1: i = 0; i < 4
        //step 2: i = 1; i < 3
        //step 3: i = 2; i < 2 => false
//        int size = stack.size();
//        for(int i = 0 ; i < size; i++) {
//            System.out.println(stack.pop()); // size = 3
//        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
