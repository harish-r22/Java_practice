package LangPackage;

public class WrapperDemo {
    public static void main(String[] args) {
        Integer j = new Integer(10);
        Integer k = Integer.valueOf(10);
        Integer l = new Integer(10);
        
        Byte b1 = 15;
        Byte b2 = Byte.valueOf("15");
        
        Float g = 12.3f;
        Float in = 12.3f/0;
        Double i= 12.5;
        Character c1 = 'a';
        Boolean bb = true;


        System.err.println(j.equals(l));
        System.out.println(g.isNaN());
        System.out.println(in.isInfinite());
        System.out.println(in==Float.POSITIVE_INFINITY);

        System.out.println(Character.isLowerCase('a'));

        System.out.println(Boolean.logicalOr(true, false));
    }
}
