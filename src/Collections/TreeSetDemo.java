package Collections;

import java.util.List;
import java.util.TreeSet;

class Point implements Comparable
{
    int x;
    int y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public String toString()
    {
        return x + " " + y;
    }

    public int compareTo(Object o){
        Point p = (Point)o;
        if(this.x<p.x){
            return -1;
        }
        else if(this.x>p.x){
            return 1;
        }
        else {
            if(this.y<p.y){
                return -1;
            }
            else if(this.y>p.y){
                return 1;
            }
            else {
                return 0;
            }
        }
    }
}

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(List.of(10,30,40,5,3,10));

        ts.add(0);
        ts.add(100);
        ts.addAll(List.of(1,2));
        System.out.println(ts.ceiling(35));
        System.out.println(ts.floor( 35));
        System.out.println(ts);

        //custom comparator
        TreeSet<Point> tcs = new TreeSet<>();

        tcs.add(new Point(1,1));
        tcs.add(new Point(1,2));
        tcs.add(new Point(2,2));
        tcs.add(new Point(2,3));
        tcs.add(new Point(3,1));
        tcs.add(new Point(1,3));

        System.out.println(tcs);




























































    }
}
