public class TreePrint {
    /**
     * Метод выводит в консоль сгенерированное семейное древо.
     * @param human - экземпляр класса человек.
     * @param step - шик, блеск, крсота.
     */
    public static void view(Human human, int step){
        if(human.getPeople().size() != 0) {
            System.out.printf("%s%s + %s:\n","- ".repeat(step), human.GetName(), human.roommate);
        }

        else {
            System.out.printf("%s%s холост.\n","- ".repeat(step), human.GetName());
        }

        for(Human a: human.getPeople()){
            view(a, step + 1);
        }
    }
}
