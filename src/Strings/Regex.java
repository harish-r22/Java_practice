package Strings;

public class Regex {
    public static void main(String[] args) {
        String var1 = "pp1";
        System.out.println("var1.matches(\".\") "+ var1.matches("."));
        System.out.println("var1.matches(\"[a-z]{2}[0-1]\" "+var1.matches("[a-z]{2}[0-1]"));
        System.out.println("var1.matches(\"[^a-c]{2}[0-1]\") "+ var1.matches("[^a-c]{2}[0-1]"));
        System.out.println("var1.matches(\"a|b\" " +var1.matches("a|b"));
        System.out.println("var1.matches(\"pp1\") "+var1.matches("pp1"));
        System.out.println("var1.matches(\"\\\\d\") " +var1.matches("\\d"));
        System.out.println("var1.matches(\"[\\\\w]*\") " +var1.matches("[\\w]*"));
        System.out.println("var1.matches(\"[\\\\w]+\") " +var1.matches("[\\w]+"));
        System.out.println(("new String(\"p\")).matches(\"[\\\\w]?\")" + new String("p")).matches("[\\w]?"));
        String var2 = "programmer@gmail.com";
        String[] var3 = var2.split("@");
        String[] var4 = var3;
        int var5 = var3.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            String var7 = var4[var6];
            System.out.println(var7);
        }

        System.out.println((new String("a!b$#CD12")).replaceAll("\\w", ""));
    }
}
