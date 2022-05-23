package MultiThreading;

class MyThread extends Thread {
    public void run(){
        int i=1;
        while(true){
            System.out.println(i + " Thread Class");
            i++;
        }
    }
}

public class MultiThreadingDemo implements Runnable{
    public void run(){
        int i=1;
        while(true){
            System.out.println(i + " Runnable Class");
            i++;
        }
    }

    public static void main(String[] args) {
        MyThread newThread = new MyThread(); // Using Thread class
        newThread.start();

        MultiThreadingDemo m = new MultiThreadingDemo();
        Thread newThread2 = new Thread(m); // passing runnable object ti thread class.
        newThread2.start(); // starting new thread using runnable interface
        int i=1;
        while(true){
            System.out.println(i + " World");
            i++;
        }

    }
}
