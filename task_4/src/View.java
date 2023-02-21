import java.util.Scanner;

public class View {
    
    public static String menu(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("=".repeat(30));
            System.out.println( " 0 - Добавить адресата\n 1 - Вывести на экран\n 2 - Экспорт данных\n 3 - Ипорт данных\n 4 - Выход");
            System.out.println("=".repeat(30));
            System.out.println("-> ");
            switch (scanner.nextLine()) {
                case "0":
                    Logging.loggingInfo("Добавить нового пользователя.");
                    return "0";
                case "1":
                    Logging.loggingInfo("Справочник выведен на консоль.");
                    return "1";
                case "2":
                    Logging.loggingInfo("Экспорт данных в файл.");
                    return "2";
                case "3":
                    Logging.loggingInfo("Импорт данных из файла.");
                    return "3";
                case "4":
                    Logging.loggingInfo("Выход из программы.");
                    return "4";
            }
        }
    }

    public static void printConsole(Humans humans){
        for(Humans human: humans.getHumans()){
            System.out.println(human.getHumanInfo());
        }
    }
}
