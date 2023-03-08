import java.util.Scanner;
/**
 * Класс Controller предназначен для разгрузки клиентского кода.
 * Чтобы View не общался напрямую с другими классами, а работал через контроллер.
 */
public class Controller {

    /**
     * Метод добавляет новый стенд в список.
     * @param stands
     */
    static public void setStand(Stands stands){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите название стенда: ");
        String stand_name = scanner.nextLine();
        
        System.out.println("Введите имя разработчика: ");
        String name = scanner.nextLine();
        System.out.println("Введите должность разработчика: ");
        String post = scanner.nextLine();
        System.out.println("Введите отдел разработчика: ");
        String departament = scanner.nextLine();
        
        System.out.println("Введите имя ответственного за паспорт: ");
        String name_1 = scanner.nextLine();
        System.out.println("Введите должность ответственного за паспорт: ");
        String post_1 = scanner.nextLine();
        System.out.println("Введите отдел ответственного за паспорт: ");
        String departament_1 = scanner.nextLine();
        System.out.println("Введите номер паспорта: ");
        String number = scanner.nextLine();

        stands.setStand(new Stands(stand_name, new Persona(name, post, departament), new Passport(new Persona(name_1, post_1, departament_1), number)));
    }

    /**
     * Метод удаляет стенд из списка.
     * @param stands
     */
    static public void removeStand(Stands stands){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название стенда: ");
        String faind = scanner.nextLine();
        
        for(Stands st: stands.getStands()){
            if(st.getStandName().equals(faind)) {
                stands.removeStand(stands.getStands().indexOf(st));
                break;
            }
        }
    }

    /**
     * Метод выводит в консоль информацию о каждом стенде.
     * @param stands
     */
    static public void outputStands(Stands stands){
        int count = 0;
        for(Stands st: stands.getStands()){
            count++;
            System.out.printf("%d %s\n",count, st.getInfo());
        }
    }
}
