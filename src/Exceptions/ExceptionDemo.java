package Exceptions;

public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            int a=1,b=0,c,A[]={1,2};
            try{
              c=a/b;
              System.out.println(c);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Inner catch block");
                System.err.println(e);
            }
            System.out.println(A[10]);
        }
        catch(ArithmeticException e){
            System.out.println("outer try block");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Outer try block");
            System.err.println(e);
        }
        finally{
            System.out.println("Finally block");
        }
        System.out.println("-----------End---------");
    }
}
