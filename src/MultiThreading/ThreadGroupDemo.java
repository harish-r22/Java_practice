package MultiThreading;


class Task2 extends Thread
{
    Task2(String a, ThreadGroup b)
    {
        super(b, a);
    }
    public void run()
    {
        for (int i = 0; i< 10; i++)
        {
            try
            {
                Thread.sleep(10);
            }
            catch (InterruptedException ex)
            {
                System.out.println(Thread.currentThread().getName());
            }
        }
        System.out.println(Thread.currentThread().getName());
    }
}
public class ThreadGroupDemo
{
    public static void main(String arg[]) throws InterruptedException, SecurityException
    {

        ThreadGroup o1 = new ThreadGroup("parent thread group");
        Task2 obj1 = new Task2 ("Thread 1 =====> ", o1);
        Task2 obj2 = new Task2 ("Thread 2 =====> ", o1);
        Task2 obj3 = new Task2 ("Thread 3 =====> ", o1);
        Task2 obj4 = new Task2 ("Thread 4 =====> ", o1);
        Task2 obj5 = new Task2 ("Thread 5 =====> ", o1);
        Task2 obj6 = new Task2 ("Thread 6 =====> ", o1);
        obj1.start();
        obj2.start();
        obj3.start();
        obj4.start();
        obj5.start();
        obj6.start();
        //To check whether running thread has permission to access
        o1.checkAccess();
        System.out.println(o1.getName() + " has access");

        System.out.println("Total number of active thread =====> "+ o1.activeCount());
        System.out.println("Total number of active thread group =====> "+ o1.activeGroupCount());

        //we can only destroy a thread group only if all the threads are stopped
        /*obj1.join();
        o1.destroy();
        System.out.println(o1.getName()+" ====> Destroyed");*/

        //copying thread group threads to another array
        /*Thread[] array = new Thread[o1.activeCount()];
        int count1 = o1.enumerate(array);

        for (int i = 0; i< count1; i++)
            System.out.println(array[i].getName() + " =====> Found");*/

        System.out.println("Maximum priority of  Thread group: " + o1.getMaxPriority());
        System.out.println("Parent Thread Group for " + o1.getName() + " is " + o1.getParent().getName());

    }
}


