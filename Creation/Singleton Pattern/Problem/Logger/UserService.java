package Problem.Logger;

public class UserService {
    Logger logger = Logger.createInstance();
    public Logger createAction(){
        logger.log("User has performed an action");
        return logger;
    }
}
