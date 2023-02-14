import java.util.Date;

/**
 * Класс который имплементирует интерфейс TaskData.
 */
public class Task <T> implements TaskData <T> {
    private T priority; // Параметризируем полиморфизм.....
    private String task_description;
    private Date date;

    /**
     * 
     * @param priority - Приоритет задачи (число / строка).
     * @param task_description - Описание задачи.
     * @param date - Дата записи задачи.
     */
    public Task(T priority, String task_description, Date date){
        this.priority = priority;
        this.task_description = task_description;
        this.date = date;
    }
    
    /**
     * Метод возвращает приоритет задачи.
     */
    public T getPriority(){
        return priority;
    }

    /**
     * Метод возвращает описание задачи.
     */
    public String getDescription(){
        return task_description;
    }

    /**
     * Метод возвращает дату создания задачи.
     * @return
     */
    public Date getDate(){
        return date;
    }
}
