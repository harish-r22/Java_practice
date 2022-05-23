package NestedClass;

abstract class My{
    abstract public void show();
}

class AnonymousOuter
{
    public void display(){
        My m = new My() {
            @Override
            public void show() {
                System.out.println("hello");
            }
        };
        m.show();
    }
}
public class AnonymousInner {
    public static void main(String[] args) {
        AnonymousOuter o = new AnonymousOuter();
        o.display();
    }
}
