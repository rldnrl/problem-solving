package datastructure;

import java.util.HashMap;
import java.util.Map;

public class TheMap {
    static record Person(String name) {}

    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Alex"));
        map.put(2, new Person("Siri"));
        map.put(3, new Person("Mariam"));

        System.out.println(map);
        System.out.println(map.size()); // 3
        System.out.println(map.get(1)); // Alex
        System.out.println(map.containsKey(4)); // false
        System.out.println(map.keySet()); // [1=Person[name=Alex], 2=Person[name=Siri], 3=Person[name=Mariam]]
        System.out.println(map.entrySet());
        System.out.println(map.values());
        map.remove(3);
        map.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
        map.forEach((key, value) -> {
            System.out.println(key + " " + value);
        });
        System.out.println(map.getOrDefault(3, new Person("default")));
        System.out.println(map.values());
    }
}
