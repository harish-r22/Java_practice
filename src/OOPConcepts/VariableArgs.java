package OOPConcepts;

public class VariableArgs {
    static void show(int a, int ...args) {
        System.out.println(a);
        for(int n : args) {
            System.out.println(n);
        }
    }

    public static void main(String args[]) {
        show(1,2,3,4);
    }
}


