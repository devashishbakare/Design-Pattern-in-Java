package Problem.Logger;

public class Main {

    public static void main(String args[]){
        UserService userService = new UserService();
        OrderService orderService = new OrderService();

        Logger instance1 = userService.createAction();
        Logger instance2 = orderService.createOrder();

        if(instance1 == instance2){
            System.out.println("Both instance are same");
        }else{
            System.out.println("Both are not same");
        }

    }


}
