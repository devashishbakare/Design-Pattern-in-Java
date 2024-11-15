public class PizzaFactory {
    public PizzaFactory(){
    }

    public OrderCounter[] prepPizza(String orders[]){
        OrderCounter[] storeObject = new OrderCounter[orders.length];
        for(int i = 0; i < orders.length; i++){
            String pizzaName = orders[i];
            System.out.println(pizzaName.toLowerCase());
            if(pizzaName.toLowerCase().equals("pepperoni")){
                storeObject[i] = new Pepperoni();
            }else if(pizzaName.toLowerCase().equals("paneer cheese")){
                storeObject[i] = new PaneerCheese();
            }else{
                storeObject[i] = null;
            }
        }
        return storeObject;
    }
}
