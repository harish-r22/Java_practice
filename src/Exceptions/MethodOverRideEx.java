package Exceptions;
import java.io.*;

class Super
{
    void show() {
        System.out.println("parent class");
    }

    void show2() throws ArithmeticException {
        System.out.println("parent class");
    }
}

public class MethodOverRideEx extends Super
{
    void show() //throws IOException                //Compile time error
    {
        System.out.println("child class");
    }

    void show2() throws ArithmeticException //we can throw same or subclass of ArithmeticException
    {
        System.out.println("child class");
    }
    public static void main(String[] args)
    {
        Super s=new MethodOverRideEx();
        s.show();
        s.show2();
    }
}
