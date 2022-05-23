package MultiThreading;

class MyData {
    //Normal flow - where both the threads access the method
    public void display(String str){
        for(int i=0;i<str.length();i++){
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.print(str.charAt(i));
        }
        System.out.print("\n");
    }

    //Using Synchronized block
    public void displayWithSyncBlock(String str){
        synchronized(this){
            for(int i=0;i<str.length();i++){
                System.out.print(str.charAt(i));
                try{Thread.sleep(100);}catch(InterruptedException e){}
            }
            System.out.print("\n");
        }
    }

    //Using sync method
    synchronized public void displayWithSyncMethod(String str){
            for(int i=0;i<str.length();i++){
                System.out.print(str.charAt(i));
                try{Thread.sleep(100);}catch(InterruptedException e){}
            }
            System.out.print("\n");
    }



}

class MyThread2 extends Thread {
    //Shared Object
    static MyData d;
    public MyThread2(MyData d,String name){
        super(name);
        this.d=d;
    }
    public void run(){
        //Without sync
        //d.display(this.getName());

        //with Sync
        //d.displayWithSyncBlock(this.getName());
        d.displayWithSyncMethod(this.getName());
    }
}


public class SynchronizedThreadsDemo {

    public static void main(String[] args) {
        MyData d=new MyData();
        MyThread2 t1 = new MyThread2(d,"Hello World Thread Hello World ThreadHello World Thread");
        MyThread2 t2 = new MyThread2(d,"Welcome Thread Welcome Thread Welcome Thread");
    
        t1.start();
        t2.start();
    }
   

}
