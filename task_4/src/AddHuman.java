import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddHuman {
    public static Humans addHuman(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ФИО пользователя: через пробел: ");
        String name = scanner.nextLine();

        System.out.println("Введите город проживания пользователя: ");
        String city = scanner.nextLine();

        System.out.println("Введите номера пользователя через пробел:");
        List<Numbers> phone = new ArrayList<Numbers>();
        String [] numbers = scanner.nextLine().split(" ");
        try{
            for(String number: numbers){
                phone.add(new Numbers(number.substring(0, 1),number.substring(2, 4), number.substring(5, 12)));
            }
        }
        catch (StringIndexOutOfBoundsException e){
            Logging.loggingError("Введен некорректный номер.");
            System.out.println("ОШИБКА! Введен некорректный номер.");
        }
        Humans human = new Humans(name, phone, city);
        return human;
    }
}
