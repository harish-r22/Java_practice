package NestedClass;

class Outer {
    private int x=10;

    class Inner
    {
        int y=20;
        public void innerDisplay(){
            System.out.println(x+" "+y);
        }
    }

    public void outerDisplay(){
        Inner i = new Inner();
        //anonymous object
        new Inner().innerDisplay();
        System.out.println(x+" "+i.y);
    }
}

public class NestedClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerDisplay();
        Outer.Inner i = new Outer().new Inner();
        i.innerDisplay();
    }
}
