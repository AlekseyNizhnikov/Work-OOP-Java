import java.io.FileWriter;
import java.io.IOException;

public class Logging {

    public static void loggingInfo(String message){
        try {
            FileWriter log_file = new FileWriter("logInfo.txt");
            log_file.write(message + "\n");
            log_file.close();
        } 
        catch (IOException e) {
            loggingError("Файл не найден.");
            e.printStackTrace();
        }  
    }

    public static void loggingError(String message){
        try {
            FileWriter log_file = new FileWriter("logError.txt");
            log_file.write(message + "\n");
            log_file.close();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }  
    }
}
