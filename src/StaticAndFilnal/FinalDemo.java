package StaticAndFilnal;

class TestStatic {
    public final void show(){
        System.out.println("Hello");
    }
}
public class FinalDemo {

    final float PI;
    static final float STATICPI;

    static{
        STATICPI=3.1425f;
    }

    {
        PI = 3.1425f;
    }
    public static void main(String[] args) {


    }
}
