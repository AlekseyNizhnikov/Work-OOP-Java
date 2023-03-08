/**
 * Клиентский код.
 */
public class Archive{ 

    /**
     * Основная функция.
     * @param args
     */
    public static void main(String[] args){
        Logging.loggingInfo("Программа запущена.");
        Stands stands = new Stands(null, null, null);

        // Бесконечный цикл обработки команд из View.
        while(true){
            String numb_menu = View.consoleRun();
            switch(numb_menu){

                case "0":
                    Controller.outputStands(stands);
                    break;

                case "1":
                    Controller.setStand(stands);   
                    break;   
                
                case "2":
                    Controller.removeStand(stands);
                    break;

                case "3":
                    System.exit(0);
                    break;
            }
        }
    }
}
