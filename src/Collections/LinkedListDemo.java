package Collections;
import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        Stack<Integer> s1 = new Stack<>();
        
        l1.add(1);
        l1.addFirst(2);
        l1.addLast(5);
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());
        System.out.println(l1);

    }
}
