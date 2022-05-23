package StaticAndFilnal;

class CoffeeMachine
{
    private float coffeeQty;
    private float waterQty;

    public String getCoffee(){
        return "New Coffee";
    }

    static private CoffeeMachine CoffeeInstance =null;

    private CoffeeMachine(){
        System.out.println("waterQty"+ " " +waterQty);
        coffeeQty=1;
        //waterQty=1.5f;
    }

    static CoffeeMachine getInstance(){

        if(CoffeeInstance!=null){
            return CoffeeInstance;
        }
        CoffeeInstance = new CoffeeMachine();
        return CoffeeInstance;
    }

}
public class SlngletonClass {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = CoffeeMachine.getInstance();
        System.out.println(coffeeMachine.getCoffee());
    }
}
