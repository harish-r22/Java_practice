package AnnotationsDemo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
      String name(); 
      String project() default "sc";
      String date() default "today";
      String version() default "13";
}

@Retention(RetentionPolicy.RUNTIME)
@interface RunImmediately{
    int times() default 1;
}

@MyAnno(name = "abhi")
class A {

    @RunImmediately(times=3)
    public void show(){
        System.out.println("I am show method");
    }
}

public class UserDefinedAnno {
    public static void main( String[] args) {
        A obj1 = new A();

        if(obj1.getClass().isAnnotationPresent(MyAnno.class)){
            System.out.println("Anno present");
        }
        else System.out.println("Anno is not present");

        for(Method method :obj1.getClass().getMethods()){
            if(method.isAnnotationPresent(RunImmediately.class)){

            }
        }
    }
   
}
