package MultiThreading;

class SharedData {
    int value =0;
    boolean flag=true;
    int count =2;
     synchronized public void set(int v) {
        // for two threads
//         while(flag!=true){
//             try{wait();}catch(InterruptedException e){}
//         }
        // for multiple consumer threads
        while(count!=0){
            try{wait();}catch(InterruptedException e){}
        }
        this.value=v;
        flag=false;
        count=2;
        notify();
    }

     synchronized public int get(){
         // for two threads
//         while(flag!=false){
//             try{wait();}catch(InterruptedException e){}
//         }
        while(count==0){
            try{wait();}catch(InterruptedException e){}
        }
        int x=value;
        flag=true;
        count--;
         notify();
//        if(count==0){
//            notify();
//        }
        return x;
    }

}

class ProducerThread extends Thread {
    SharedData d;
    public ProducerThread(SharedData d){
        this.d=d;
    }

    public void run(){
        int i=1;
        while(i<=5){
            System.out.println("pro :"+i);
            d.set(i);
            System.out.flush();
           //try{Thread.sleep(100);}catch(InterruptedException e){}
           i++;
        }
    }
}

class ConsumerThread extends Thread {
    SharedData d;
    public ConsumerThread(SharedData d,String name){
        super(name);
        this.d=d;
    }

    public void run(){
        int i=0;
        while(i<=5){
           System.out.println("Con"+ this.getName() +" :" +d.get());
           System.out.flush();
           //try{Thread.sleep(100);}catch(InterruptedException e){}
           i++;
        }
    }
}



public class InterThreadCommunication {

    public static void main(String[] args) {
        SharedData d= new SharedData();
        ProducerThread p = new ProducerThread(d);
        ConsumerThread c1 = new ConsumerThread(d,"c1");
        ConsumerThread c2 = new ConsumerThread(d,"c2");

        p.start();
        c1.start();
        c2.start();
    }
    
}
