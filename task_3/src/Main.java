import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public class Main{ 

    public static void main(String[] args) throws FileNotFoundException{

        Scanner scanner = new Scanner(System.in);
        TaskScheduler taskScheduler = new TaskScheduler();
        String priority = "";
        String text = "";

        // Донимаем пользователя вопросами.
        while (true){
            //Предлагаем добавить задачу.
            System.out.println("Добавить задачу... Y/N?");
            if(scanner.nextLine().equals("Y")){
                System.out.println("Введите приоритет(1 - Высокий, 2 - Средний, 3 - Низкий): ");
                priority = scanner.nextLine();
                System.out.println("Постановка задачи: ");
                text = scanner.nextLine();

                //Собственно реализация параметричекого полиморфизма. Ввести в качестве приоритета можно как слово так и число.
                if(priority.matches("-?\\d+?")){
                    Date date = new Date();
                    taskScheduler.setTask(new Task <Integer>(Integer.parseInt(priority), text, date));
                }
                else{
                    Date date = new Date();
                    taskScheduler.setTask(new Task <String>(priority, text, date));
                }
            }
            
            //Предлагаем удалить задачу.
            System.out.println("Удалить задачу... Y/N?");
            if(scanner.nextLine().equals("Y") && taskScheduler.getListTask().size() > 0){
                System.out.println("Введите ID:");
                taskScheduler.removeTask(scanner.nextInt());
            }
            else System.out.println("Некорректный ввод.");

            //Предлагаем удалить задачу.
            System.out.println("Экспорт файла Y/N?");
            if(scanner.nextLine().equals("Y")){
                PrintTask.writerFile(taskScheduler);
            }
            else System.out.println("Некорректный ввод.");
            
            //Выводим красиво на экран.
            System.out.println("-".repeat(100));
            PrintTask.print(taskScheduler);
            System.out.println("-".repeat(100));
        }
    }
}
