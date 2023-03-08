import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
 * Самодельное логгирование. Два уровня логгирования: информативный и логгирование ошибок.
 */
public class Logging {

    /**
     * Метод принимает сообщение о процессе и записывает лог в файл, добавляя дату.
     * @param message
     */
    public static void loggingInfo(String message){
        try {
            FileWriter log_file = new FileWriter("logInfo.txt", true);
            Date date = new Date();
            log_file.write(String.format("%s %s\n", date, message));
            log_file.close();
        } 
        catch (IOException e) {
            loggingError("Файл не найден.");
            e.printStackTrace();
        }  
    }

    /**
     * Метод принимает сообщение об ошибке и записывает лог в файл, добавляя дату.
     * @param message
     */
    public static void loggingError(String message){
        try {
            FileWriter log_file = new FileWriter("logError.txt", true);
            Date date = new Date();
            log_file.write(String.format("%s %s\n", date, message));
            log_file.close();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }  
    }
}
