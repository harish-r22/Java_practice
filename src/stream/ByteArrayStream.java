package StreamsDemo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrayStream {
    public static void main(String[] args) throws Exception {
         byte b[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n'};

         ByteArrayInputStream bis = new ByteArrayInputStream(b);
         ByteArrayOutputStream bos = new ByteArrayOutputStream();
         int x;
         
         //checking is mark supported
         System.out.println(bis.markSupported()); 
         bos.write(b);
         System.out.println(new String(bos.toByteArray()));
         while((x=bis.read())!=-1){
             System.out.print((char)x);
         }
         bis.close();
         bos.close();
    } 
}
