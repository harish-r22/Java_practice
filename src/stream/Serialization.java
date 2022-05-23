package StreamsDemo;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.Serializable;

class Student implements Serializable{
    int roolNo;
    String name;
    String dept;
}

public class Serialization {
    static Student s;
    static String path ="D:/Abhilash/java-new-programs/streamData/objectdata.txt";

    static void solution1() throws Exception{
        FileOutputStream fos = new FileOutputStream(path);
        PrintStream ps = new PrintStream(fos);
        ps.println(s.roolNo);
        ps.println(s.name);
        ps.println(s.dept);
        
        FileInputStream fis = new FileInputStream(path);
        BufferedReader bf = new BufferedReader(new InputStreamReader(fis));
        
        System.out.println(Integer.parseInt(bf.readLine()));
        System.out.println(bf.readLine());
        System.out.println(bf.readLine());

        ps.close();
        fos.close();
    }

    static void solution2() throws Exception{
        FileOutputStream fos = new FileOutputStream(path);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeInt(s.roolNo);
        dos.writeUTF(s.name);
        dos.writeUTF(s.dept);
        
        FileInputStream fis = new FileInputStream(path);
        DataInputStream dis = new DataInputStream(fis);
        
        System.out.println(dis.readInt());
        System.out.println(dis.readUTF());
        System.out.println(dis.readUTF());

        dis.close();
        fos.close();
        fis.close();
        dos.close();
    }
    
    static void solution3() throws Exception{
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        oos.writeObject(s);
        
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        Student student =(Student)ois.readObject();

        System.out.println(student.name);
        System.out.println(student.roolNo);
        System.out.println(student.dept);
        

        ois.close();
        fos.close();
        fis.close();
        oos.close();
    }
    
    public static void main(String[] args) throws Exception{
        //Problem is Need to store objects in file
        s = new Student();
        s.roolNo=10;
        s.name="Abhilash";
        s.dept="ECE";

        //solution 1 - using print stream
        //solution1();

        //solution 2 - using dataOutputStream
        //solution2();

        //solution 3 - using serialization
        solution3();
    }
}
