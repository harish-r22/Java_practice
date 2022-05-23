package javaBasics.basics.Inheritance;

public interface InterfaceB {

    default int getSizes(Integer i){
        System.out.println(i);
        return i;
    }
    static int getAge(Integer i){
        System.out.println(i);
        return i;
    }
}
