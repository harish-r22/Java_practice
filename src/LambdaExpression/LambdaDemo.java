package LambdaExpression;

@FunctionalInterface
interface MyLambda
{
    public String display(String message);
}

@FunctionalInterface
interface MyLambda2
{
    public void display(String message);
}

class Demo{
    
    public void method1(){
        int count=0;
        MyLambda2 m = System.out::println;
        m.display("Hello method reference");
        //count++; error
    } 
}

class UseLambda {
    public void callLamda(MyLambda m1){
        m1.display("hello");
    }
}

public class LambdaDemo {
    public static void main(String[] args) {
        MyLambda m = (message)->"Printed the value";

        System.out.println(m.display("Hello World"));

        Demo d = new Demo();
        
        //we can pass lambda as parameter to another function

        UseLambda u = new UseLambda();

        u.callLamda(m);

        d.method1();

    }
}
