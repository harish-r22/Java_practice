package Generics;


class Data<T> {
    private T obj;

    public void setData(T v){
        obj=v;
    }

    public T getData(){
        return obj;
    }
}
public class GenericsDemo {

    //generic method
    static <E> void show(E[] list){
       for (E e : list) {
           System.out.println(e);
       }   
    }
    
    public static void main(String[] args) {
        //data as integer
        Data<Integer> d = new Data<>();

        d.setData(10);
        System.out.println(d.getData());

         //data as String
         Data<String> s = new Data<>();

         s.setData("hai");
         System.out.println(s.getData());

         //generic method

         show(new String[]{"Hi","Hello","Bye"});
         show(new Integer[]{10,20,30}); 
    }
}
