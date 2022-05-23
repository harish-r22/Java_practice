package Collections;

import java.util.BitSet;

public class BitSetDemo {
    public static void main(String[] args) {
        BitSet b = new BitSet();
        b.set(2);
        b.set(3);
        b.set(6);
        b.flip(3);
        BitSet b1 = new BitSet();
        b1.set(2);
        b1.set(3);
        b1.set(6);
        b1.flip(4);
        b.and(b1);
        System.out.println(b);
    }
}
