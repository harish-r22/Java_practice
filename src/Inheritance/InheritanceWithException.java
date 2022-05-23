package javaBasics.basics.Inheritance;


import java.io.CharConversionException;
import java.io.IOException;
import java.sql.SQLException;
//If checked exception on parent class method
class Person{
    int abs =100;
    public Object getDemo() throws CharConversionException {

        return new Object();
    }

}
class child extends Person{
    int abs =100;
    public String getDemo() throws RuntimeException {

        return "";
    }
}
public class InheritanceWithException {
    public static void main(String[] args) {
        Person p = new child();
        //p.getDemo();
    }
}
