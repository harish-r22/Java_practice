package OOPConcepts;


class Circle1 {
    public double radius;
    Circle1(double radius){
        this.radius=radius;
        System.out.println("Parent constructor");
    }

    class CircleInner {
        public void show(){
            System.out.println("I am inner class");
        }
    }


    public double area(){
        return Math.PI * radius * radius;
    }
    public void show(){
        System.out.println("I am parent method");
    }

    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    public String toString(){
        return radius + " " ;
    }
}

class Cylinder extends Circle1 {
    public double height;
    public double radius;

    Cylinder(double radius,double height){
        super(radius);
        this.height=height;
        this.radius=radius-2;

        System.out.println("Child constructor"+ super.radius + " " +this.radius);
    }

    public void show(){
        System.out.println("I am child method");
    }

    public double Volume(){
        System.out.println("Child constructor"+ super.radius + " " +this.radius);
        return  Math.PI * this.radius * this.radius * height;
    }
    public String toString(){
        return super.toString() + " " + height;

    }
    protected void finalize()
    {
        System.out.println("Finalize method of cylinder class");
    }
}

public class InheritanceCircle {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(10.0,5.0);
        c1.radius=7;
        c1.height=10;
        Circle1 c2 = new Cylinder(10.0, 5.0);

        //inner class
        Circle1.CircleInner inner=c2.new CircleInner();


        System.out.println("Volume "+c1.Volume());
        System.out.println("Area "+c1.area());
       c2.show();


        System.out.println(c2.toString());
        System.out.println(c1.toString());

        //by making object reference as null we can garbage collect an object
        c1=null;
        System.gc();
    }
}