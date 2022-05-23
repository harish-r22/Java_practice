package Exceptions;


class NegativeDimensionException extends Exception
{
   public String toString()
   {
       return "Area cannot be negative";
   }
}

public class ThrowAndThrows {
    static int area(int l, int b) throws NegativeDimensionException{
        if(l<0 || b<0){
            throw new NegativeDimensionException();
        }
        return l*b;
    }
    static void meth1() throws NegativeDimensionException{
        System.out.println("Area is " + area(10,-3));

    }
    public static void main(String[] args){
        try{
          meth1();
        }
        catch(NegativeDimensionException e){
            System.out.println(e);
        }
        finally {
            System.out.println("I am Good");
        }

    }
}
