package MultiThreading;

import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Task implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        Thread.sleep(3000);
        return new Random().nextInt();
    }
}
public class CallableAndFuture {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);

        List<Future<Integer>> futureList = IntStream.range(0,10).mapToObj(i->service.submit(new Task())).collect(Collectors.toList());

        try {
            System.out.println("Future Value "+futureList.get(9).get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
