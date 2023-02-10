/** 
 * Абстрактный класс. Описывает общие свойства характерные для каждого человека.
*/
public abstract class Man {
    private String name;
    private Integer age;
    private Boolean gender;

    /**
     * Метод записывает имя конкретного человека в переменную name.
     * @param name - имя человека
     */
    public void AddName (String name){
        this.name = name;
    }

    /**
     * Метод записывает пол конкретного человека в переменную gender.
     * @param gender - пол конкретного челоека.
     */
    public void AddGender (Boolean gender){
        this.gender = gender;
    }

    /**
     * Метод записывает возраст конкретного человека в переменную age.
     * @param age - возраст конкретного человека.
     */
    public void AddAge (Integer age){
        this.age = age;
    }

    /**
     * Метод возвращает имя.
     * @return
     */
    public String GetName (){
        return name;
    }

    /**
     * Метод возвращает пол.
     * @return
     */
    public Boolean GetGender (){
        return gender;
    }

    /**
     * метод возвращает возраст.
     * @return
     */
    public Integer GetAge (){
        return age;
    }

    /**
     * Абстрактный метод, общий для всех. Принимает на вход имя и выводит на консоль особое приветствие.
     * @param name
     */
    public abstract void Greeting (String name);
}
