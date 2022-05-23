package Collections;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<>(10,0.55f);

        h1.add(10);
        h1.add(20);
        h1.add(10);
        h1.add(30);
        h1.add(10);

        System.out.println(h1);

        h1.remove(10);
        System.out.println(h1);

    }
}
