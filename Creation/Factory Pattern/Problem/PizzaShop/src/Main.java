public class Main {
    public static void main(String[] args) {
        //here user gave use the orders
        User user = new User();
        String userOrder[] = user.order();

        // we sent order to respective department
        PizzaFactory pizzaFactory = new PizzaFactory();
        OrderCounter[] pizzaDepartment = pizzaFactory.prepPizza(userOrder);

        // each department is preparing pizza
        for(OrderCounter department : pizzaDepartment){
            if(department != null) {
                department.createPizza();
            }
        }
    }
}