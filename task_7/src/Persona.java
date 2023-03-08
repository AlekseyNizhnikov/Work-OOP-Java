/**
 * Класс описывает объект персона, он же работник. ФИО, отдел, должность.
 */
public class Persona {
    private String name_person;
    private String post_person;
    private String department_person;

    /**
     * Конструктор класса.
     * @param name - ФИО сотрудника.
     * @param post - должность сотрудника.
     * @param departament - отдел сотрудника.
     */
    public Persona(String name, String post, String departament){
        this.name_person = name;
        this.post_person = post;
        this.department_person = departament;
    }

    /**
     * ФИО разработчика/ответственного за стенд.
     * @param name - ФИО сотрудника.
     */
    public void setName(String name){
        this.name_person = name;
    }

    /**
     * Должность разработчика/ответственного за стенд.
     * @param post - должность сотрудника.
     */
    public void setPost(String post){
        this.post_person = post;
    }

    /**
     * Отдел разработчика/ответственного за стенд.
     * @param departament - отдел сотрудника.
     */
    public void setDepartament(String departament){
        this.department_person = departament;
    }

    /**
     * Метод возвращает ФИО сотрудника.
     * @return
     */
    public String getName(){
        return this.name_person;
    }

    /**
     * Метод возвращает должность сотрудника.
     * @return
     */
    public String getPost(){
        return this.post_person;
    }

    /**
     * Метод возвращает отдел сотрудника.
     * @return
     */
    public String getDepartament(){
        return this.department_person;
    }
}
