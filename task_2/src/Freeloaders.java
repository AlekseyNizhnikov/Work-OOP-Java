import java.util.ArrayList;
import java.util.List;

/**
 * Класс нахлебников. По сути список домашних животных для каждого человека.
 */
public class Freeloaders extends Animals{
    
    List<Freeloaders> freeloaders = new ArrayList<>();

    /**
     * Конструктор класса.
     * @param nickname - имя домашнего животного.
     * @param age - возраст домашнего животного.
     */
    public Freeloaders(String nickname, Integer age){
        AddNickname(nickname);
        AddAge(age);
    }

    /**
     * Метод добавляет в список домашних животных, питомца с именем nickname и возрастом age.
     * @param animal
     */
    public void addFreeloaders(Freeloaders animal){
        freeloaders.add(animal);
    }

    /**
     * Метод возвращает список домашних животных.
     * @return
     */
    public List<Freeloaders> getFreeloaders(){
        return freeloaders;
    }

    /**
     * Переопределение метода. Для корректного вывода.
     */
    @Override
    public String toString() {
        return GetNickname();
    }

    /**
     * Метод обстрактного класса. Вывод информации о себе.
     */
    public void PrintInfo(){
        System.out.printf("Меня зовут %s и мне %d лет.\n", GetNickname(), GetAge());
    }
}
