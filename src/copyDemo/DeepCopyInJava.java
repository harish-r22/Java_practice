d package javaBasics.basics.copyDemo;

class CourseNew implements Cloneable
{
    String subject1;

    String subject2;

    String subject3;

    public CourseNew(String sub1, String sub2, String sub3)
    {
        this.subject1 = sub1;

        this.subject2 = sub2;

        this.subject3 = sub3;
    }

    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

class StudentNew implements Cloneable
{
    int id;

    String name;

    CourseNew course;

    public StudentNew(int id, String name, CourseNew course)
    {
        this.id = id;

        this.name = name;

        this.course = course;
    }

    //Overriding clone() method to create a deep copy of an object.

    protected Object clone() throws CloneNotSupportedException
    {
        StudentNew student = (StudentNew) super.clone();

        student.course = (CourseNew) course.clone();

        return student;
    }
}

public class DeepCopyInJava
{
    public static void main(String[] args)
    {
        CourseNew science = new CourseNew("Physics", "Chemistry", "Biology");

        StudentNew student1 = new StudentNew(111, "John", science);

        StudentNew student2 = null;

        try
        {
            //Creating a clone of student1 and assigning it to student2

            student2 = (StudentNew) student1.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

        //Printing the subject3 of 'student1'

        System.out.println(student1.course.subject3);         //Output : Biology

        //Changing the subject3 of 'student2'

        student2.course.subject3 = "Maths";

        //This change will not be reflected in original student 'student1'

        System.out.println(student1.course.subject3);       //Output : Biology
    }
}
