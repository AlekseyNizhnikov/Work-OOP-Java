import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Tree {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Human father = new Human("Sergey", true, 40, GeneratAnimals());
        father.addRoomate(new Human("Mari", false, 35, GeneratAnimals()));
        List<Human> tree = new ArrayList<Human>();
        tree.add(father);

        Integer DEPTH_TREE = 5;

        randChildren(tree, DEPTH_TREE);

        System.out.printf("Родословная %s\n", tree.get(0).GetName());
        System.out.println("=".repeat(30));
        TreePrint.view(tree.get(0), 0);
        System.out.println("=".repeat(30));

        while (true){
            System.out.println("Введите имя человека для подсчета детей: ");
            String name = scanner.nextLine();
            
            calcCildren(name, tree.get(0));
        }
    }

    /**
     * Метод генерирует список классов случайных домашних животных.
     * @return
     */
    public static List<Freeloaders> GeneratAnimals(){
        List<String> nicknames = new ArrayList<>(Arrays.asList("Кот Мурзик", "Кот Барсик", "Собак Бим", "Попугай Кеша", "Собака Лайка", "Собака Бобик", "Попугай Гоша"));

        Freeloaders animals = new Freeloaders(nicknames.get(dice(6)), 1);
        animals.addFreeloaders(animals);

        //Генерим случаное число домашних животных.
        for(int i = 0; i < dice(3); i++){
            Freeloaders animal = new Freeloaders(nicknames.get(dice(6)), 1);
            animals.addFreeloaders(animal);
        }
        return animals.getFreeloaders();
    }

    /**
     * Метод возвращает случайное число от 0 до range.
     * @param range - предел диапазона случайных чисел.
     * @return
     */
    public static int dice(Integer range){
        Random random = new Random();
        Integer dice = random.nextInt(range);
        return dice;
    }

    /**
     * Рекурсивный метод. Наполняет дерево случайными людьми, случайным количеством.
     * @param tree - семейное дерево, List <People>.
     * @param depth - глубина семейного древа.
     * @return
     */
    public static List<Human> randChildren(List<Human> tree, int depth){
        List<String> names_boy = new ArrayList<>(Arrays.asList("Aleksey", "Vasilii", "Petr", "Oleg", "Kirill", "Victor", "Maxim"));
        List<String> names_girl = new ArrayList<>(Arrays.asList("Any", "Oly", "Liza", "Katy", "Masha", "Dasha", "Nasty"));
        List<Boolean> genders = new ArrayList<>(Arrays.asList(true, false));

        if(depth == 0) return tree;
        for(Human human: tree){
            for(int i = 0; i <= dice(2); i++){
                Boolean gender = genders.get(dice(2));
                Human baby;

                if(gender){
                    baby = new Human(String.format("%s", names_boy.get(dice(6))), gender, 30, GeneratAnimals());
                    baby.addRoomate(new Human(String.format("%s", names_girl.get(dice(6))), gender, 25, GeneratAnimals()));
                    
                }
                else{
                    baby = new Human(String.format("%s", names_girl.get(dice(6))), gender, 25, GeneratAnimals());
                    baby.addRoomate(new Human(String.format("%s", names_boy.get(dice(6))), gender, 30, GeneratAnimals()));
                }

                human.add_human(baby);
            }
        }
        return randChildren(tree.get(0).getPeople(), depth-1);
        
    }

    /**
     * Метод выводит на экран количество детей конкретного человека.
     * @param name - параметр имя входящего экземпляра класса.
     * @param human - экземпляр класса - человек.
     */
    public static void calcCildren(String name, Human human){
        if(human.GetName().equals(name)) {
            human.Greeting();
            List<Freeloaders> animals = human.getFreeloaders();
            if(animals.size() > 0){
                System.out.printf("У меня %d детей и есть домашние животные %s\n", human.getPeople().size(), animals);
            }
            else System.out.printf("У меня %d детей и нет домашних животных.\n", human.getPeople().size());
        }
        else{
            for(Human a: human.getPeople()){
                calcCildren(name, a);
            }
        }
    }
}
