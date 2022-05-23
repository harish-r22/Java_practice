package Exceptions;


class LowBalanceException extends Exception 
{
    @Override
    public String toString() {
        return "Balance should not be less than 5000";
    }
}

public class ExceptionClass {
    static void unCheckedException(){
        try{
            System.err.println(10/0); //unchecked exception
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    static void checkedException(){
        try {
            throw new LowBalanceException();
        } catch (LowBalanceException e) {
            System.out.println(e);
        }
    }

    static void fun3(){
        unCheckedException();
    }

    public static void main(String[] args) {
        if(false){
            checkedException();
            System.out.println("hhhs");
        }
        //fun3();
        //checkedException();
    }
}
