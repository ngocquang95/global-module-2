package ss7_generic;

import java.util.LinkedList;
import java.util.Queue;

public class Practice4 {
    static void main() {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(null);

        System.out.println(queue.remove());
        System.out.println("...");
    }
}
