package NestedClass;

class LocalOuter {
    private int x=10;
    public void outerDisplay(){
        class Inner
        {
            int y=20;
            public void innerDisplay(){
                System.out.println(x+" "+y);
            }
        }
        Inner i = new Inner();
        System.out.println(x+" "+i.y);
    }
}

public class LocalInner {
    public static void main(String[] args) {
        LocalOuter o = new LocalOuter();
        o.outerDisplay();
    }
}
