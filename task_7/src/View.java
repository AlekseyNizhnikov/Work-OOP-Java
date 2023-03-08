import java.util.Scanner;

/**
 * Класс View отвечает за взаимодействие с пользователем, в данном случае через консоль.
 */
public class View {

    /**
     * Метод реализующий обмен данными с пользователем через консоль.
     * @return
     */
    public static String consoleRun(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("=".repeat(30));
            System.out.println( " 0 - Посмотреть список стендов\n 1 - Добавить стенд\n 2 - Удалить стенд\n 3 - Выход из программы");
            System.out.println("=".repeat(30));
            System.out.println("-> ");
            switch (scanner.nextLine()) {
                case "0":
                    Logging.loggingInfo("Посмотреть список стендов.");
                    return "0";
                case "1":
                    Logging.loggingInfo("Добавить стенд.");
                    return "1";
                case "2":
                    Logging.loggingInfo("Удалить стенд.");
                    return "2";
                case "3":
                    Logging.loggingInfo("Выход из программы.");
                    return "3";
            }
        }
    }
}
