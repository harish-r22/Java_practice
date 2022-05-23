package LangPackage;

public class StringClass {
    
   public static void main(String[] args) {
    String s="Hello";

    StringBuilder s1 = new StringBuilder("Hello");//Thread safe
    StringBuffer sb = new StringBuffer("Hello");// not thread safe
    s1.append("!!");
    s1.reverse();


    System.out.println(s1);
    
   }
}
 