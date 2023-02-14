import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Класс вывода списка задач и все сопутствующей информации в консоль.
 */
public class PrintTask {

    public static void print(TaskScheduler taskScheduler){
        for(Task task: taskScheduler.getListTask()){
            System.out.printf("Date: %s | id: %d | ПРИОРИТЕТ: %s | ЗАДАЧА: %s\n",task.getDate(), taskScheduler.getID(task), task.getPriority(), task.getDescription());
        }
    }

    /**
     * Экспорт данных в файл txt.
     * @param taskScheduler
     * @throws UnsupportedEncodingException
     * @throws FileNotFoundException
     */
    public static void writerFile(TaskScheduler taskScheduler) throws FileNotFoundException{
        PrintWriter writer = new PrintWriter("tasks.txt");
        for(Task task: taskScheduler.getListTask()){
             writer.printf("Date: %s | id: %d | ПРИОРИТЕТ: %s | ЗАДАЧА: %s\n",task.getDate(), taskScheduler.getID(task), task.getPriority(), task.getDescription());
        }
        writer.close();
    }
}
