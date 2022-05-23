package Collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

class MyCom implements Comparator<Integer> {
    public int compare (Integer o1, Integer o2){
        if(o1<o2) return 1;
        else if(o1>o2) return -1;
        else return 0;
    }
}
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();


        p.add(10);
        p.add(25);
        p.add(15);
        p.add(8);
        p.add(26);

        p.poll();

        Iterator<Integer> it = p.iterator();

        for(Integer i ; it.hasNext();){
            System.out.println(it.next());
        }


        PriorityQueue<Integer> p1 = new PriorityQueue<>(new MyCom());
        // now p1 will have reverse priority highest value will have higher priority
        p1.add(10);
        p1.add(25);
        p1.add(15);
        p1.add(8);
        p1.add(26);

        p1.poll();

        Iterator<Integer> it1 = p1.iterator();
        System.out.println("p2 values");
        for(Integer i ; it1.hasNext();){
            System.out.println(it1.next());
        }

    }
}
