package javaBasics.basics.threads.locks;

public class CompanyRunner {

    public static void main(String[] args) {

        Company company =  new Company();
        Producer producer = new Producer(company);
        Consumer consumer = new Consumer(company);
        producer.start();
        consumer.start();





    }
}
