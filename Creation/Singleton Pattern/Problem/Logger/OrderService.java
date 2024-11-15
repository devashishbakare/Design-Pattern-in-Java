package Problem.Logger;

public class OrderService {
    Logger logger = Logger.createInstance();
    public Logger createOrder(){
        logger.log("Order has been created");
        return logger;
    }
}
