package Pattern;

class Singleton{
    //static so that
    private static Singleton instance;

    private Singleton(){}

    public static Singleton createInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    /*
    if there is multi-threading
        public static Logger createInstance(){
            if(loggerInstance == null){
                synchronized (Logger.class){
                    if(loggerInstance == null){
                       loggerInstance = new Logger();
                    }
                }
            }
            return loggerInstance;
        }
     */
}