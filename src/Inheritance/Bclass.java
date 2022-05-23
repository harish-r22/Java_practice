package javaBasics.basics.Inheritance;

public class Bclass implements InterfaceA ,InterfaceB{


    @Override
    public int getSizes(Integer i) {
        System.out.println("In A class "+i);
        return i;
    }
}
