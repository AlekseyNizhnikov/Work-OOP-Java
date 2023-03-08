/**
 * Абстратный класс обобщающий стенды.
 */
abstract class Stand {  

    private String stand_name;
    private Persona persona;

    /**
     * Метод присваивает название стенду.
     * @param stand_name - название стенда.
     */
    public void setStandName(String stand_name){
        this.stand_name = stand_name;
    }

    /**
     * Метод добавляет ФИО сотрудника.
     * @param persona - ФИО сотрудника.
     */
    public void setPersona(Persona persona){
        this.persona = persona;
    }

    /**
     * Метод Возвращает объект сотрудника.
     * @return
     */
    public Persona getPersona(){
        return this.persona;
    }

    /**
     * метод возвращает строку с названием стенда.
     * @return
     */
    public String getStandName(){
        return this.stand_name;
    }
}
