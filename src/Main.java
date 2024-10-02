public class Main{
    public static void main(String[] args){
        // Pizza basePizza =new Pizza(true);
        // basePizza.addExtraTopins();
        // basePizza.addExtraCheese();
        // basePizza.akeAway();
        // basePizza.getBill();
        DeluxePizza dp = new DeluxePizza(false);
        dp.addExtraCheese();
        dp.TakeAway();
        dp.getBill();
    }
}