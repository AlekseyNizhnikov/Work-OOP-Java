import java.util.ArrayList;
import java.util.List;

/**
 * Класс планировщик задач. по сути добавляет задачу в список текущих задач. 
 */
public class TaskScheduler {
    static List<Task> task_scheduler = new ArrayList<Task>();

    /**
     * Конструктор
     * @param task - экземпляр класса задача.
     */
    public void setTask(Task task){
        task_scheduler.add(task);
    }

    /**
     * Метод удаляет задачу с заданным id из списка.
     * @param id - номер задачи.
     */
    public void removeTask(int id){
        task_scheduler.remove(id);
    }

    /**
     * Возвращаем список текущих задач.
     * @return
     */
    public List<Task> getListTask(){
        return task_scheduler;
    }

    /**
     * Генерируем ID задачи. Простоым добавлением единицы.
     * @param task
     * @return
     */
    public Integer getID(Task task){
        Integer count = 1;
        for(Task item: task_scheduler){
            if(item == task) return count;
            count ++;
        }
        return -1;
    }
}
