package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class TheQueue {
    static record Person(String name, int age) { }

    public static void main(String[] args) {
        Queue<Person> supermarket = new LinkedList<>();

        supermarket.add(new Person("Alex", 21));
        supermarket.add(new Person("Maria", 18));
        supermarket.add(new Person("Ali", 30));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }
}
