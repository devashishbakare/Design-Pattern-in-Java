package Problem.Logger;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class Logger {

    private static Logger loggerInstance;
    private static final String fileName = "events.log";
    private Logger(){}

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
    public void log(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(message);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Error writing to log file: " + e.getMessage());
        }
    }

}
