/**
 * Абстрактный класс домашнего животного.
 */
public abstract class Animals {
    private String nickname;
    private Integer age;

    /**
     * Метод присваивает значение переменной nickname.
     * @param nickname - имя животного.
     */
    public void AddNickname(String nickname){
        this.nickname = nickname;
    }

    /**
     * Метод присваивает значение переменной age.
     * @param age - возраст животного.
     */
    public void AddAge(Integer age){
        this.age = age;
    }

    /**
     * Метод возвращает имя животного.
     * @return
     */
    public String GetNickname(){
        return nickname;
    }

    /**
     * Метод возвращает возраст животного.
     * @return
     */
    public Integer GetAge(){
        return age;
    }

    /**
     * Метод вывода на консоль возраста животного взятого из экземпляра класса.
     */
    public abstract void PrintInfo();
    
}
