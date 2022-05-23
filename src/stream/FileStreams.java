package StreamsDemo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



public class FileStreams {

    static void copy(String sourceFile , String destinationFile){
        try(FileInputStream fis = new FileInputStream(sourceFile); FileOutputStream fos = new FileOutputStream(destinationFile);)
        {
           byte b[] = new byte[fis.available()];
           fis.read(b);
           String str = new String(b);
           str=str.toLowerCase();
           fos.write(str.getBytes());
        }
        catch(Exception e){
            System.out.println(e);
        }

    }

    static void  writeData(){
        try{
            FileOutputStream fos = new FileOutputStream("D:/Abhilash/java-new-programs/streamData/data.txt");
            String str = "Learn Java Programming by Abhilash";
            // 1st method
            //fos.write(str.getBytes());

            //2nd method
            // byte b[]= str.getBytes();
            // for(byte x:b){
            //     fos.write(x);
            // }

            //3rd offset - to copy from java offset
            byte b[]= str.getBytes();
            fos.write(b,6,str.length()-6);
            
            fos.close();
        }
        catch(FileNotFoundException e){
           System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    static void  readDataStream(){
        try{
            FileInputStream fos = new FileInputStream("D:/Abhilash/java-new-programs/streamData/data.txt");
            //1st method
            byte b[] = new byte[fos.available()];
            fos.read(b);
            System.out.println(new String(b));
            fos.close();
        }
        catch(FileNotFoundException e){
           System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
         //writeData();
         //readDataStream();
         copy("D:/Abhilash/java-new-programs/streamData/source1.txt", "D:/Abhilash/java-new-programs/streamData/source2.txt");
    }
}
