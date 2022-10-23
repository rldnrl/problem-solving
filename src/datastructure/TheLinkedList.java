package datastructure;

import java.util.LinkedList;
import java.util.ListIterator;

public class TheLinkedList {
    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();

        linkedList.add(new Person("Alex", 21));
        linkedList.add(new Person("Alexa", 18));
        linkedList.add(new Person("Ali", 30));
        linkedList.addFirst(new Person("Siri", 35));

        ListIterator<Person> personListIterator = linkedList.listIterator();

        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }

        System.out.println();

        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }
    }

    static record Person(String name, int age) {}
}
