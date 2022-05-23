package MultiThreading;

class Thread1 extends Thread{
    @Override
    public void run() {
        System.out.println("Before System shut down");
    }
}

public class shutDownHook {
    public static void main(String[] args) {
        Runtime obj = Runtime.getRuntime();

        obj.addShutdownHook(new Thread1());
        try {
            System.out.println("Thread is sleeping. Press Ctrl+c to stop server");
            Thread.sleep(4000);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
