package Collections;
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(20);
        ArrayList<Integer> list2 = new ArrayList<>(List.of(50,60,70,80));
        list.add(10);
        list.add(0,5);
        list.addAll(list2);
        System.out.println(list);
        list.addAll(0,list2);
        System.out.println(list);
        System.out.println(list.get(5));
        System.out.println(list.indexOf(5));
        System.out.println(list.contains(5));

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        ListIterator<Integer> lit = list.listIterator();

        while (lit.hasNext()){
            System.out.println(lit.next());
            System.out.println(lit.previous());
        }

        list.forEach((x) -> {
            System.out.println(x);
        });
    }


}
