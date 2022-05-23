package StreamsDemo;
import java.io.*;

public class RandomAccessDemo {
    public static void main(String[] args) throws Exception{
        RandomAccessFile rf = new RandomAccessFile("D:/Abhilash/java-new-programs/streamData/data.txt", "rw");
        
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        
        rf.write('I');
        System.out.println((char)rf.read());
        rf.skipBytes(2);
        System.out.println((char)rf.read());
        rf.seek(3);
        System.out.println((char)rf.read());
        System.out.println(rf.getFilePointer());
         
    }
}
