package Strings;

public class StringBuilderBuffer {
    public static void main(String[] args) {
        //String Buffer - Thread Safe

        StringBuffer sbr = new StringBuffer("Java");
        sbr.append("Program");
        System.out.println(sbr);


        //String Builder - it is not thread safe

        StringBuilder sbu = new StringBuilder("Java");
        sbr.append("Program");
        System.out.println(sbr);
    }
}
