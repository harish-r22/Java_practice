package LangPackage;

import java.lang.reflect.*;

class My {
    private int a;
    protected int b;
    public int c;
    int d;

    public My(){}

    public My(int x,int y){}

    public void display(String s1,String s2){}

    public int show(int x, int y){return 0;}

}

public class RellectionDemo {

    public static void main(String[] args) {
        Class c =My.class;

        System.out.println(c.getName());

        Field fields[] = c.getDeclaredFields();

        for(Field field : fields){
            System.out.println(field);
        }
        System.out.println(c.getDeclaredFields());
    }
}
