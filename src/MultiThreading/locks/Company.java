package javaBasics.basics.threads.locks;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Company {

    LinkedList<String> stringList = new LinkedList<>();

    private static ReentrantLock lock = new ReentrantLock(true);
    Condition condition = lock.newCondition();

    public void produceItem(String str){
        lock.lock();
        try{
            condition.signal();
        System.out.println("Produce :"+str);
        this.stringList.add(str);
        } finally {
            lock.unlock();
        }

    }

    public void consumeItem(){
        lock.lock();
        try {
            if (this.stringList.isEmpty()) {
                condition.await();
                System.out.println("Consume :" + stringList.peekLast());
                stringList.pollLast();

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
