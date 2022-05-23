package javaBasics.basics.threads;

public class ThreadExample {

    public static void main(String[] args) throws InterruptedException {

        Task1 task1 = new Task1();
        task1.setPriority(1);
        task1.start();
        Thread task2Thread = new Thread(new Task2());
        task2Thread.setPriority(10);
        task2Thread.start();
        task1.join();
        Thread task3Thread = new Thread(new Task3());
        task3Thread.start();

    }


}
