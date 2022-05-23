package MultiThreading;

import java.util.concurrent.*;

class Task1 implements Runnable{
    String name;
    Task1(String name){
       this.name=name;
    }

    @Override
    public void run() {
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("Executing Thread"+ this.name);
    }
}

public class ThreadPoolClass {
    public static void main(String[] args) throws InterruptedException {
        //To get No of cores in CPU
        Integer noOfCores = Runtime.getRuntime().availableProcessors();

        //Fixed Thread Pool
        //ExecutorService service = Executors.newFixedThreadPool(noOfCores);

        //Cached Thread Pool
        //ExecutorService service = Executors.newCachedThreadPool();


/*        //Scheduled Thread Pool
        ScheduledExecutorService service = Executors.newScheduledThreadPool(noOfCores);

        //To Schedule a Task After 2sec
        //service.schedule(new Task1("1"),2, TimeUnit.SECONDS);

        //To Schedule a task repeatedly after 2sec
        //service.scheduleAtFixedRate(new Task1("2"), 0, 2,TimeUnit.SECONDS);

        //To Schedule a task repeatedly after previous task completed with delay
        service.scheduleWithFixedDelay(new Task1("3"),0,2,TimeUnit.SECONDS);*/

        //Single Thread Pool
        //ExecutorService service = Executors.newSingleThreadExecutor();

//        for(Integer i=0;i<noOfCores;i++){
//            service.execute(new Task1(i.toString()));
//        }

        //initiate the shutdown process
        //service.shutdown();




        // thread pool using -> Thread Pool Executor constructor

        /*ExecutorService service = new ThreadPoolExecutor(noOfCores,10,60,TimeUnit.SECONDS,new ArrayBlockingQueue<>(10));

        //Handling Task Rejection
        for(Integer i=0;i<50;i++){
            try {
                service.execute(new Task1(i.toString()));
            }
            catch (RejectedExecutionException e){
                System.out.println("Error: "+ e.getMessage());
            }

        }*/

    }
}
