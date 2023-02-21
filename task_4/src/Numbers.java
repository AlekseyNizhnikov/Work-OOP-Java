import java.util.ArrayList;
import java.util.List;

public class Numbers extends Number{
    List<Numbers> phone_numbers = new ArrayList<Numbers>();

    public Numbers(String code, String number, String start_code){
        setCode(code);
        setNumber(number);
        setStartCode(start_code);
    }

    public void setPhoneNumbers(Numbers phone_number){
        phone_numbers.add(phone_number);
    }
    public List<Numbers> getPhoneNumbers(){
        return phone_numbers;
    }
}
