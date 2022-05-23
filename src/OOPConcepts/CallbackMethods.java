package OOPConcepts;

interface Member {
    void callback(String Msg);
}

class Customer implements Member {
    String name;
    Customer(String name){
        this.name=name;
    }

    public void callback(String Msg){
        System.out.println("Hi, " + this.name + "\n" + Msg);
    }

}

class Store {
    Member[] customers = new Member[100];
    int count = 0;
    public void register(Member m){
        customers[count++]=m;
    }

    public void inviteAll() {
        for(int i=0; i<count;i++){
            customers[i].callback("Welcome to RJ store we have exciting offers today");
        }
    }
}



public class CallbackMethods {

    public static void main(String[] args) {
        Customer c1 = new Customer("Abhilash CR");
        Customer c2 = new Customer("Harish CR");
        Customer c3 = new Customer("Ravi CB");

        Store s1 = new Store();

        s1.register(c1);
        s1.register(c2);
        s1.register(c3);

        s1.inviteAll();


    }
}

