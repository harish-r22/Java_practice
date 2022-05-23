package NestedClass;

class StaticOuter {
     int x=10;
    static public int z=11;
    static class Inner
    {
        int y=20;
        public void innerDisplay(){
            System.out.println(z+" "+y);
        }
    }

    public void outerDisplay(){
        Inner i = new Inner();
        //anonymous object
        new Inner().innerDisplay();
        System.out.println(x+" "+i.y);
    }
}

public class StaticInner {
    public static void main(String[] args) {
        StaticOuter o = new StaticOuter();
        o.outerDisplay();
        StaticOuter.Inner i = new StaticOuter.Inner();
        i.innerDisplay();
    }
}
