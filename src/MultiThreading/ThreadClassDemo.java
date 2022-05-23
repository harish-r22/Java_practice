package MultiThreading;

class MyThread1 extends Thread{
    public MyThread1(String name)
    {
        super(name);

    }
    public void run(){
        int count=0;
        while(true){
            System.err.println("My thread "+ count);
            // try {
            //     //Thread.sleep(100);
            // } catch (InterruptedException e) {
            //     e.printStackTrace();
            // }
            count++;
        }
    }
}

public class ThreadClassDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 t = new MyThread1("My thread one");

        //Threads Getters and setters
         System.out.println("ID " + t.getId());
         t.setPriority(9);
         System.out.println("State "+ t.getState());
         System.out.println("end");
         System.out.println("Priority "+ t.getPriority());
         System.out.println("Name" + t.getName());
        t.setDaemon(true);

        t.start();

        //Yield 
//        int count=0;
//        while(true){
//            System.err.println("Main thread "+ count);
//            //It allows other thread to run
//            //Thread.yield();
//            count++;
//        }
        
        //Join
        // Thread mainThread=Thread.currentThread();// to get current thread reference
        // mainThread.join(); // to make main thread to join other daemon thread

        //Interrupt
        try{Thread.sleep(100);}catch(Exception e){}
        t.interrupt(); // to interrupt a thread after it started while sleeping
    }
}
