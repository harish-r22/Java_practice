package javaBasics.basics.threads.locks;

public class Producer extends Thread {

    Company company;
    public Producer(Company company) {
        this.company = company;
    }

    @Override
    public void run() {
        for (int i=0;i<100;i++){
            company.produceItem(String.valueOf(i));
        }
    }

}
