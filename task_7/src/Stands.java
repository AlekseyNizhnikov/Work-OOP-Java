import java.util.ArrayList;
import java.util.List;

/**
 * Класс наследник абстраткного класса Stand.
 */
public class Stands extends Stand{

    // Список стендов.
    private List <Stands> stands = new ArrayList<>();
    private Passport passport;

    /**
     * Конструктор класса.
     * @param stand_name - название стенда.
     * @param persona - ФИО сотрудника.
     * @param pasport - паспорт на стенд.
     */
    public Stands(String stand_name, Persona persona, Passport pasport) {
        setPersona(persona);
        setStandName(stand_name);
        this.passport = pasport;
    }

    /**
     * Метод добавляет новый стенд в список.
     * @param stands
     */
    public void setStand(Stands stands ){
        this.stands.add(stands);
    }

    /**
     * Метод возвращает список всех стендов.
     * @return
     */
    public List<Stands> getStands(){
        return stands;
    }

    /**
     * Метод возвращает объект passport для конкретного стенда.
     * @return
     */
    public Passport getPassport(){
        return passport;
    }

    /**
     * Метод удаляет стенд из списка по полученному id.
     * @param id - номер стенда в списке.
     */
    public void removeStand(int id){
        this.stands.remove(id);
        System.out.println("Данные стенда удалены...");
    }

    /**
     * Метод возвращает строку с информацией о стенде.
     * @return
     */
    public String getInfo(){
        return String.format("Название стенда: %s| Имя разработчика: %s| Должность: %s| Отдел: %s", 
                            getStandName(), getPersona().getName(), getPersona().getPost(), getPersona().getDepartament());
    }
}
