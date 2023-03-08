/**
 * Класс паспорт, наследник класса Stand.
 */
public class Passport extends Stand {

    // Переменная теоретически хранит путь к местонахождению файла на ПЗУ.
    private String path_passport;

    /**
     * Конструктор класса.
     * @param persona - ФИО сотрудника.
     * @param path_passport - путь к файлу C:/.....
     */
    public Passport(Persona persona, String path_passport) {
        setPersona(persona);
        this.path_passport = path_passport;
    }

    /**
     * Метод возвращает путь к файлу.
     * @return
     */
    public String getFilePassport(){
        return path_passport;
    }
}
