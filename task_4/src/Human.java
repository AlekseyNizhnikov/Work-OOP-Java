import java.util.List;

public abstract class Human {
    private String name;
    private List<Numbers> numbers;
    private String adress;
    
    public void setName(String name){
        this.name = name;
    }

    public void setNumbers(List<Numbers> numbers){
        this.numbers = numbers;
    }

    public void setAdress(String adress){
        this.adress = adress;
    }

    public String getName(){
        return name;
    }

    public List<Numbers> getNumbers(){
        return numbers;
    }

    public String getAdress(){
        return adress;
    }

    @Override
    public String toString() {
        String number = "";
        for(Numbers numb: numbers){
            number += numb + " ";
        }
        return number;
    }
}
