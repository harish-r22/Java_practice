package javaBasics.basics.threads.producer_consumer_problem;

class Q{
    int num;
    boolean valueSet =false;
    public synchronized void put(int num){
        if(valueSet){
            try{wait();}catch (Exception e){}
        }
        System.out.println("Put :"+num);
        this.num=num;
        valueSet =true;
        notify();
    }

    public synchronized void get(){
        if(!valueSet){
            try{wait();}catch (Exception e){}
        }
        System.out.println("Get :"+num);
        valueSet=false;
        notify();
    }
}
class Producer implements Runnable{
    Q q;
    public Producer(Q q){
        this.q = q;
        Thread thread = new Thread(this,"Producer");
        thread.start();
    }

    @Override
    public void run() {
        int i =0;
        while(true){
            q.put(i++);
            try {Thread.sleep(2000);} catch (InterruptedException e) {}
        }
    }
}
class Consumer implements Runnable{
    Q q;
    public Consumer(Q q){
        this.q = q;
        Thread thread = new Thread(this,"Consumer");
        thread.start();
    }

    @Override
    public void run() {
    while(true){
        q.get();
        try {Thread.sleep(2000);} catch (InterruptedException e) {}
    }
    }
}


public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Q q =new Q();
        Producer producer = new Producer(q);
        Consumer consumer = new Consumer(q);


    }
}
