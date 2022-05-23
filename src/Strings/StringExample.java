package Strings;

public class StringExample {
    public static void main(String[] args) {

        //creation
        String var1 = "Java";
        String var2 = "Java";

        //creates a variable in string pool
        String var3 = new String("Java").intern();
        String var5 = new String("Java");
        byte[] var4 = new byte[]{65, 66, 67, 68};
        new String(var4);
        char[] var6 = new char[]{'J', 'A', 'V', 'A'};
        new String(var6, 2, 2);
        System.out.println(var1 == var3);
        System.out.println(var1 == var2);


    }
}
