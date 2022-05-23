package LangPackage;

enum Dept
{
    //all are public static and final
    CS("John","Block A")
    ,IT("JohnIT","Block B")
    ,CIVIL("JohnC","Block C")
    ,ECE("JohnE","Block D")
    ,CSE("JohnC","Block E");

    String head;
    String loc;
   
    private Dept(String head , String loc){
        this.head = head;
        this.loc = loc;
    }

    public void display(){
        System.out.println(this.name() + " " + this.ordinal());
    }

    public String getHead(){
        return this.head;
    }

    public String getLoc(){
        return this.loc;
    }

}
public class EnumDemo {
 
    public static void main(String[] args) {
        
        Dept d=Dept.CIVIL;
        d.display();
        Dept list[] = Dept.values();
        System.out.println(d.ordinal());
        System.out.println(Dept.valueOf("IT"));

        // for(Dept i : list){
        //     System.out.println(i);
        // }

    }
}
