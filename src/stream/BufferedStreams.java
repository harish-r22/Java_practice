package StreamsDemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedStreams {static void copy(String sourceFile , String destinationFile){
    try(FileInputStream fis = new FileInputStream(sourceFile); 
        FileOutputStream fos = new FileOutputStream(destinationFile);
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
       )
    {
       byte b[] = new byte[bis.available()];
       bis.read(b); 
       String str = new String(b);
       str=str.toLowerCase();
       bos.write(str.getBytes());
    }
    catch(Exception e){
        System.out.println(e);
    }

}

public static void main(String[] args) throws Exception {
    copy("D:/Abhilash/java-new-programs/streamData/source1.txt", "D:/Abhilash/java-new-programs/streamData/source2.txt");
} 
}
