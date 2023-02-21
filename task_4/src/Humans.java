import java.util.ArrayList;
import java.util.List;

public class Humans extends Human{
    List<Humans> humans = new ArrayList<Humans>();
    String info;

    public Humans(String name, List<Numbers> numbers, String adress){
        setName(name);
        setNumbers(numbers);
        setAdress(adress);
    }

    public String getHumanInfo(){
        info = String.format("%s %s %s", getName(), getNumbers(), getAdress());
        return info;
    }

    public void setHumans(Humans human){
        humans.add(human);
    }

    public List<Humans> getHumans(){
        return humans;
    }
}