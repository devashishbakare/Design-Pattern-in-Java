public class Main {
    public static void main(String[] args) {
        PizzaSizeBridge smallChickenPizza = new ChickenPizza(new SmallSizePizza());
        String desc = smallChickenPizza.getDescription();
        double cost = smallChickenPizza.getCost();
        System.out.println(desc + " " + cost);

        PizzaSizeBridge bigVegPizza = new VegPizza(new BizSizePizza());
        desc = bigVegPizza.getDescription();
        cost = bigVegPizza.getCost();
        System.out.println(desc + " " + cost);
    }
}