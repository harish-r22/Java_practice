package javaBasics.basics.threads.locks;

public class Consumer extends Thread {

    Company company;

    public Consumer(Company company) {
        this.company = company;
    }

    @Override
    public void run() {
        for (int i=0;i<100;i++){
            company.consumeItem();
        }
    }
}
