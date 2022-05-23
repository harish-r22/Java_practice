package Collections;

import java.util.ArrayDeque;

public class ArrayDequeDemo  {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>(10);
        // to use it as queue
        queue.offerLast(1);
        queue.offerLast(2);
        queue.offerLast(4);
        queue.offerLast(5);

        queue.pollFirst();

        queue.forEach(x->System.out.println(x));

        ArrayDeque<Integer> stack = new ArrayDeque<>(10);
        // to use it as stack
        stack.offerLast(1);
        stack.offerLast(2);
        stack.offerLast(4);
        stack.offerLast(5);
        stack.pollLast();

        stack.forEach(x->System.out.println(x));
    }
}
