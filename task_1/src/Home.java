import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Home {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        People father = new People("Sergey", true);
        father.addRoomate(new People("Mari", false));

        List<People> tree = new ArrayList<People>();
        tree.add(father);

        Integer DEPTH_TREE = 5;

        randChildren(tree, DEPTH_TREE);

        System.out.printf("Родословная %s\n", tree.get(0).name);
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
    public static List<People> randChildren(List<People> tree, int depth){
        List<String> names_boy = new ArrayList<>(Arrays.asList("Aleksey", "Vasilii", "Petr", "Oleg", "Kirill", "Victor", "Maxim"));
        List<String> names_girl = new ArrayList<>(Arrays.asList("Any", "Oly", "Liza", "Katy", "Masha", "Dasha", "Nasty"));
        List<Boolean> genders = new ArrayList<>(Arrays.asList(true, false));

        if(depth == 0) return tree;
        for(People human: tree){
            for(int i = 0; i <= dice(2); i++){
                Boolean gender = genders.get(dice(2));
                People baby;

                if(gender){
                    baby = new People(String.format("%s", names_boy.get(dice(6))), gender);
                    baby.addRoomate(new People(String.format("%s", names_girl.get(dice(6))), gender));
                    
                }
                else{
                    baby = new People(String.format("%s", names_girl.get(dice(6))), gender);
                    baby.addRoomate(new People(String.format("%s", names_boy.get(dice(6))), gender));
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
    public static void calcCildren(String name, People human){
        if(human.name.equals(name)) System.out.printf("У %s %d детей.\n",human.name, human.getPeople().size());
        else{
            for(People a: human.getPeople()){
                calcCildren(name, a);
            }
        }
    }
}
