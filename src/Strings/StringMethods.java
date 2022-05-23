package Strings;

public class StringMethods {
    public static void main(String[] args) {
        String var1 = "Java Program";
        System.out.println("Length "+var1.length());
        System.out.println("ToUpperCase "+var1.toUpperCase());
        System.out.println("ToLowerCase "+var1.toLowerCase());
        System.out.println("Trim "+var1.trim());
        System.out.println("SubString "+var1.substring(4));
        System.out.println("SubString with end Index"+ var1.substring(4, 8));
        System.out.println("Replace "+ var1.replace('J', 'a'));
        System.out.println("Starts With" + var1.startsWith("Jav"));
        System.out.println("Ends With "+ var1.endsWith("am"));
        System.out.println("ChatAt(index) " +var1.charAt(5));
        System.out.println("indexOf "+ var1.indexOf(97));
        System.out.println("indexOf with fromIndex "+var1.indexOf(97, 4));
        System.out.println("Last Index Of "+var1.lastIndexOf(97));
        System.out.println("equals " +var1.equals("Java Program"));
        System.out.println("equalsIgnoreCase "+var1.equalsIgnoreCase("Java program"));
        System.out.println("compareTo "+var1.compareTo("aava Program"));
        byte var2 = 4;
        System.out.println("valueOf(4) "+String.valueOf(var2));
        System.out.println("concat "+ var1.concat("Program"));
        char[] var3 = new char[5];
        var1.getChars(4, 7, var3, 0);
        System.out.println("getChars(start,end,charArr,startArrayPosition) "+var3.toString());
        char[] var4 = var1.toCharArray();
        System.out.println("ToCharArray "+ var4.toString());
        System.out.println("getBytes "+var1.getBytes());
        System.out.println("isBlank " +var1.isBlank());
        System.out.println("split "+ var1.split(" "));
        System.out.println(var1.join("-","a","b","b"));

    }
}
