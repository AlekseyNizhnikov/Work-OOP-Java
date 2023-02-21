public class Phonebook{ 


    public static void main(String[] args){
        Numbers numbers = new Numbers("+7", "951", "12-35-68");
        numbers.setPhoneNumbers(numbers);
        
        Humans humans = new Humans("Вася", numbers.getPhoneNumbers(), "Челябинск");
        humans.setHumans(humans);
        
        Logging.loggingInfo("Запуск программы...");
        while (true){
            switch (View.menu()){
                case "0":
                    Humans human_1 = AddHuman.addHuman();
                    humans.setHumans(human_1);
                    break;
                case "1":
                    View.printConsole(humans);
                    break;
                case "2":
                    File.exportFile("export.txt", humans);
                    break;
                case "3":
                    File.importFile("import.txt");
                    break;
                case "4":
                    Logging.loggingInfo("Выход из программы...");
                    System.exit(0);
            }
        }
    }
}
