import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File {
    public static void exportFile(String file_name, Humans humans){

        try {
            FileWriter export_file = new FileWriter(file_name, false);
            for(Humans human: humans.getHumans()){
                export_file.write(human.getHumanInfo() + "\n");
            }
            export_file.close();
        } 
        catch (IOException e) {
            e.printStackTrace();
            Logging.loggingError(String.format("Файл %s не найден", file_name));
        }  
    }

    public static void importFile(String file_name){

        try {
            FileReader import_file = new FileReader(file_name);
            BufferedReader reader = new BufferedReader(import_file);
            String line = reader.readLine();
            while (line != null){
                System.out.println(line);
            }
            reader.close();
            import_file.close();
        } 
        catch (IOException e) {
            e.printStackTrace();
            Logging.loggingError(String.format("Файл %s не найден", file_name));
        }  
    }
}
