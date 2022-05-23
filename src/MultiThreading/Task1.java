package javaBasics.basics.threads;

import java.util.Hashtable;

class Task1 extends Thread {


    Hashtable<Number, Integer> integerHashtable = new Hashtable<>();

    @Override
    public void run() {
        System.out.println("Task1 Started");
        System.out.println(Thread.currentThread().getName()+"  Priority "+Thread.currentThread().getPriority());
        for (int i = 1; i <= 100; i++) {
            integerHashtable.put(i, i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(i + " ");
        }
        System.out.println("\n");
        System.out.println("Task1 completed");
    }
}

class Task2 extends Task1 implements Runnable {
    public void run() {
        System.out.println("Task2 Started");
        System.out.println(Thread.currentThread().getName()+"  Priority "+Thread.currentThread().getPriority());
        for (int i = 101; i <= 200; i++) {
            integerHashtable.put(i, i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(i + " ");
        }
        System.out.println("\n");
        System.out.println("Task2 completed");
    }


}

class Task3 extends Task2 implements Runnable {
    public void run() {
        System.out.println("Task3 Started");
        System.out.println(Thread.currentThread().getName()+"  Priority "+Thread.currentThread().getPriority());
        for (int i = 201; i <= 300; i++) {
            integerHashtable.put(i, i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(i + " ");
        }
        System.out.println("\n");
        System.out.println("Task3 completed");
    }
}
