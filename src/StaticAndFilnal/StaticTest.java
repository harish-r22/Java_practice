package StaticAndFilnal;

class Test {
    static int x=10;
    int y=20;
    void show(){
        System.out.println(this.x+ " " +this.y);
        this.display();
    }

    static void display(){
        System.out.println(x);
    }

    static class InnerClass {
        static int y=10;
        static void display(){
            System.out.println("Inner static"+ " "+y);
        }
        static{
            System.out.println("Inner Static Block" + " " + x + " " +y);
        }
    }

    static class NormalInnerClass {
        static int z=10;
        void display(){
            System.out.println("Inner static"+ " "+x);
        }
        static{
            System.out.println("Inner Static Block" + " " + x);
        }
    }

    static{
        System.out.println("Static Block" + " " + x);
        InnerClass i = new InnerClass();
        i.display();
    }
    static{
       System.out.println("Static Block-2" + " " + x);
        NormalInnerClass i = new NormalInnerClass();
        i.display();
    }

}

public class StaticTest{
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.show();
        t1.x=100;
        t1.display();
        Test.display();
    }
}