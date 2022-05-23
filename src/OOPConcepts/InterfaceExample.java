package OOPConcepts;
import java.util.Arrays;

interface Test {
    String value="Test";
    void meth1();
    void meth2();

    // we can have default methods in interface
    default void meth5(){
        System.out.println("default methods");
    }

    // we can have static methods in interface
    static public void meth6(){
        System.out.println("static methods");
    }

    // we can have private methods in interface
    private void meth7(){
        System.out.println("private methods");
    }
}

interface Test2 {
    void meth2();
    void meth3();
}

class sub implements Test, Test2 {
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }

    public boolean isClassImplementsTest(){
        Arrays.stream(sub.class.getInterfaces()).forEach(System.out::println);
        if(Test.class.isAssignableFrom(sub.class)){
            return true;
        }
        else return false;
    }
}

public class
InterfaceExample {
    public static void main(String[] args) {
        sub t = new sub();
        t.meth1();
        t.meth2();
        t.meth3();

        Test t1 = new sub();
        t1.meth2();
        t1.meth1();
        System.out.println(t1.value + " " + t.value + " " + Test.value);

        t.meth5();

        Test.meth6();

        System.out.println(t.isClassImplementsTest());


    }
}

