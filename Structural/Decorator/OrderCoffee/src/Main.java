public class Main {
    public static void main(String[] args) {
        Coffee coffee = new BaseCoffee();
        System.out.println(coffee.getDescription() + " " + coffee.getCost());
        coffee = new Milk(coffee);
        System.out.println(coffee.getDescription() + " " + coffee.getCost());
        coffee = new Cream(coffee);
        System.out.println(coffee.getDescription() + " " + coffee.getCost());
    }
}