public abstract class Number {
    private String code;
    private String number;
    private String start_code;

    public void setCode(String code){
        this.code = code;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public void setStartCode(String start_code){
        this.start_code = start_code;
    }

    public String getCode(){
        return code;
    }

    public String getNumber(){
        return number;
    }

    public String getStartCode(){
        return start_code;
    }
}
