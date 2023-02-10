import java.util.ArrayList;
import java.util.List;

public class Human extends Man{
    Human roommate;
    List<Freeloaders> freeloaders;
    List<Human> family = new ArrayList<>();

    /**
     * Конструктор класса - человек.
     * @param name - имя человека.
     * @param gender - пол человека.
     */
    public Human(String name, Boolean gender, Integer age, List<Freeloaders> freeloaders) {
        AddName(name);
        AddGender(gender);
        AddAge(age);
        this.freeloaders = freeloaders;
    }

    /**
     * Метод добавляет человека в список - семья.
     * @param human - конкретный человек. Экземпляр класса.
     */
    public void add_human(Human human){
        family.add(human);
    }

    /**
     * Метод возвращает список домашних животных.
     * @return
     */
    public List<Freeloaders> getFreeloaders(){
        return freeloaders;
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
        return GetName();
    }

    /**
     * Обязательный метод для наследуемого класса, т.к. он есть в абстрактном классе. Приветствие.
     */
    public void Greeting(){
        String name = GetName();
        System.out.printf("Привет! Меня зовут %s\n", name);
    }
}
