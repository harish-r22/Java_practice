package OOPConcepts;

class Subject {
    String name;
    int id;
    int maxMarks;

    Subject(String name, int id, int maxMarks){
        this.name=name;
        this.id=id;
        this.maxMarks=maxMarks;
    }

    public String toString(){
        return this.name + " " + this.id + " " + this.maxMarks;
    }
}



public class StudentExample {
    String name;
    int roolNo;
    int classNo;
    Subject[] subjects;

    StudentExample(String name,int roolNo,int classNo,Subject[] subjects){
        this.name=name;
        this.roolNo=roolNo;
        this.classNo=classNo;
        this.subjects=subjects;
    }

    public String toString(){
        return this.name + " " + this.roolNo + " " + this.classNo + " " + this.subjects;
    }

    public void addSubject(String name, int id, int maxMarks){
        for(int i=0; i< subjects.length; i++){
            if(subjects[i]==null) {
                subjects[i] = new Subject(name, id, maxMarks);
                break;
            }
        }
    }

    public void removeSubject(int id){
        for(int i=0; i< subjects.length; i++){
            if(id==subjects[i].id) {
                subjects[i] = null;
                break;
            }
        }
    }


    public static void main(String[] args) {
        StudentExample s1 = new StudentExample("Abhilash CR", 001,2,new Subject[6]);
        s1.addSubject("Maths",1,100);
        s1.removeSubject(1);
        s1.addSubject("Science",2,100);
        s1.addSubject("Maths",1,100);
        System.out.println(s1);
        for(Subject s : s1.subjects){
            System.out.println(s);
        }
    }
}

