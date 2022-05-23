package java8;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Async {
    //Task
    static class Task implements Callable<Integer>{
        @Override
        public Integer call(){
            return new Random().nextInt();
        }
    }
    public static void main(String[] args) {

        
        /**
         * ExecutorService is a JDK API that simplifies running tasks in asynchronous mode. Generally speaking, ExecutorService automatically provides a pool of threads and an API for assigning tasks to it
         */
        ExecutorService service = Executors.newFixedThreadPool(10);
        
        //submit the task and accept the placeholder object for return value
        
        Future<Integer> future = service.submit(new Task());

        try {
            Integer result = future.get();//blocking call
            System.out.println(result);
        }
        catch(InterruptedException | ExecutionException e)
        {
            System.err.println(e);
        }

    }
}
