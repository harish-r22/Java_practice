package AnnotationsDemo;


class Parent{
   public void display(){};
   
   @Deprecated
   public void show(){


   }
}

public class InBuildAnno extends Parent{
    
    @Override
    public void display(){
      
    }

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Parent o = new InBuildAnno();

        o.show();
    }
}
