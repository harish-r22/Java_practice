package LangPackage;

public class ObjectClass {
    public static void main(String[] args) {
         Object o = new Object();
         Object o1 = new Object();
         Object o2 = o;
         System.out.println(o.equals(o1));
         System.out.println(o.equals(o2));
         System.out.println(o.getClass());
         System.out.println(o.hashCode());
         System.out.println(o.toString());
    }
}
