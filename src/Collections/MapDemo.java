package Collections;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> m1 = new TreeMap<>(Map.of(2,2,8,8,9,9));
        m1.put(1,1);
        m1.put(2,2);
        m1.put(3,2);
        m1.put(4,2);
        m1.put(5,2);
        m1.put(6,2);

        System.out.println(m1);
        System.out.println(m1.ceilingEntry(2));
        System.out.println(m1.containsKey(1));
        System.out.println(m1.descendingKeySet());
        System.out.println(m1.entrySet());
        System.out.println(m1.pollFirstEntry());

        System.out.println("Hash Map");
        HashMap<Integer,String> m2 = new HashMap<>(Map.of(2,"AB",8,"HI",9,"LA"));

        m2.put(4,"sh");


        m2.compute(4,(k,v)->v+"cr");
        System.out.println(m2);

        System.out.println("Linked Hash Map");

        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>(5,0.75f,true){
            protected boolean removeEldestEntry(Map.Entry e){
                return size()>5;
            }
        };

        lhm.put(1,"A");
        lhm.put(2,"B");
        lhm.put(3,"H");
        lhm.put(4,"I");
        lhm.put(6,"L");
        lhm.put(5,"A");
        lhm.put(8,"S");

        lhm.get(4);
        lhm.get(6);

        System.out.println(lhm);
    }
}
