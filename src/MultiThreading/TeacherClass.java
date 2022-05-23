package MultiThreading;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class WhiteBoard
{
    String text;
    int numberOfStudents=0;
    int count=0;
    Map<String,Boolean> students=new HashMap<>();
    public void attendance(Student s)
    {
        numberOfStudents++;
    }

    
    synchronized public void write(String t)
    {
        System.out.println("Teacher is Writing " +t);
        while(count!=0)
                try{wait();}catch(Exception e){}
        text=t;
        count=numberOfStudents;
        students.clear();
        notifyAll();

    }
    synchronized public String read(String name)
    {
        if(students.containsKey(name)) return "";
        while(count==0)
                try{wait();}catch(Exception e){}
            
        String t=text;
        count--;
        students.put(name,true);
        if(count==0)
                notify();
        return t;
    }
    
}
class Teacher extends Thread
{
    WhiteBoard wb;
    
    String notes[]={"Java is language","It is OOPs","It is Platform Independent","It supports Thread","end"};
    
    public Teacher(WhiteBoard w)
    {
        wb=w;
    }
    
    public void run()
    {
        for(int i=0;i<notes.length;i++)
            wb.write(notes[i]);
    }          
    
}

class Student extends Thread
{
    String name;
    WhiteBoard wb;

    public Student(String n,WhiteBoard w)
    {
        name=n;
        wb=w;
    }
    
    public void run()
    {
        String text;
        wb.attendance(this);
                
        do
        {
            text=wb.read(this.name);
            if(text!="") {
                System.out.println(this.name + " Reading " + text);
                System.out.flush();
            }
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }while(!text.equals("end"));
    }
    
}


public class TeacherClass
{
    public static void main(String[] args) 
    {
        WhiteBoard wb=new WhiteBoard();
        Teacher t=new Teacher(wb);
        
        Student s1=new Student("1. John",wb);
        Student s2=new Student("2. Ajay",wb);
        Student s3=new Student("3. Kloob",wb);
        Student s4=new Student("4. Smith",wb);
        
        t.start();
        
        s1.start();
        s2.start();
        s3.start();
        s4.start();
        
    }   
}