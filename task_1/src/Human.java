import java.util.ArrayList;
import java.util.List;

public class Human {
    String name;
    Human roommate;
    Boolean gender;
    List<Human> family = new ArrayList<>();

    /**
     * Конструктор класса - человек.
     * @param name - имя человека.
     * @param gender - пол человека.
     */
    public Human(String name, Boolean gender) {
        this.name = name;
        this.gender = gender;
    }

    /**
     * Метод добавляет человека в список - семья.
     * @param human - конкретный человек. Экземпляр класса.
     */
    public void add_human(Human human){
        family.add(human);
    }

    /**
     * Метод присваивает переменной ссылку на экземпляр класса - сожитель.
     * @param human - конкретный человек. Экземпляр класса.
     */
    public void addRoomate(Human human){
        roommate = human;
    }

    /**
     * Метод возвращает список детей.
     * @return
     */
    public List<Human> getPeople(){
        return family;
    }

    /**
     * Метод возвращает ссылку на экземпляр класса - сожитель.
     * @return
     */
    public Human getRoomate(){
        return roommate;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
