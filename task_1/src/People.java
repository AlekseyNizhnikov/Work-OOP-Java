import java.util.ArrayList;
import java.util.List;

public class People {
    String name;
    People roommate;
    Boolean gender;
    List<People> family = new ArrayList<>();

    /**
     * Конструктор класса - человек.
     * @param name - имя человека.
     * @param gender - пол человека.
     */
    public People(String name, Boolean gender) {
        this.name = name;
        this.gender = gender;
    }

    /**
     * Метод добавляет человека в список - семья.
     * @param human - конкретный человек. Экземпляр класса.
     */
    public void add_human(People human){
        family.add(human);
    }

    /**
     * Метод присваивает переменной ссылку на экземпляр класса - сожитель.
     * @param human - конкретный человек. Экземпляр класса.
     */
    public void addRoomate(People human){
        roommate = human;
    }

    /**
     * Метод возвращает список детей.
     * @return
     */
    public List<People> getPeople(){
        return family;
    }

    /**
     * Метод возвращает ссылку на экземпляр класса - сожитель.
     * @return
     */
    public People getRoomate(){
        return roommate;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
