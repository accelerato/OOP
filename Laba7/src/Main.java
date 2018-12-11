import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> states = new LinkedList<String>();

        // добавим в список ряд элементов
        states.add("Германия");
        states.add("Франция");
        states.addLast("Великобритания"); // добавляем на последнее место
        states.addFirst("Испания"); // добавляем на первое место
        states.add(1, "Италия"); // добавляем элемент по индексу 1

        System.out.printf("В списке %d элементов \n", states.size());
        for(String state : states){

            System.out.println(state);
        }
        System.out.println("");
        System.out.println(states.get(1));
        states.set(1, "Дания");
        for(String state : states){

            System.out.println(state);
        }
        System.out.println("");
        // проверка на наличие элемента в списке
        if(states.contains("Германия")){

            System.out.println("Список содержит государство Германия");
        }
        System.out.println("");
        states.remove("Германия");
        states.removeFirst(); // удаление первого элемента
        states.removeLast(); // удаление последнего элемента
        System.out.println("удаление первого и последнего элемента");
        for(String state : states){

            System.out.println(state);
        }

        System.out.println("");
        System.out.println("");
        LinkedList<Person> people = new LinkedList<Person>();
        people.add(new Person("Mike"));
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        for(Person p : people){

            System.out.println(p.getName());
        }
        people.remove(1); // удаление второго элемента
        System.out.println("удаление второго элемента");
        for(Person p : people){

            System.out.println(p.getName());
        }
        Person first = people.getFirst();
        System.out.println("вывод первого элемента");
        System.out.println(first.getName()); // вывод первого элемента
    }
}
