package OOPConcepts;


abstract class Super{
    public Super() {
        System.out.println("Super Constructor");
    }

    public void meth1(){
        System.out.println("Meth1 of super");
    }

    abstract public void meth2();
}

class Sub extends  Super{
    public Sub() {
        System.out.println("Sub Constructor");
    }

    public void meth1(){
        System.out.println("Meth1 of sub");
    }
    @Override
    public void meth2(){
        System.out.println("Meth2 of sub");
    }
}

class Abstraction {
    public static void main(String[] args) {
        Sub s = new Sub();

        s.meth1();
        s.meth2();
    }
}