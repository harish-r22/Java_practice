package Collections;

import java.util.StringTokenizer;
import java.io.*;

public class StringTokenDemo {
    public static void main(String[] args) throws Exception {
        String data="name=Abhilash;age=12;class=12";
        FileInputStream fis = new FileInputStream("D:/Abhilash/java-new-programs/src/Collections/data.txt");
        byte b[] = new byte[fis.available()];
        fis.read(b);
        String d = new String(b);

        StringTokenizer s = new StringTokenizer(d,",");

        while (s.hasMoreTokens()){
            System.out.println(s.nextToken());
        }
    }
}
