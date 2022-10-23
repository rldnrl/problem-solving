package datastructure;

import java.util.HashSet;
import java.util.Set;

public class TheSets {
    static record Ball(String color) {}

    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();

        balls.add(new Ball("blue"));
        balls.add(new Ball("blue")); // duplicate
        balls.add(new Ball("yellow"));
        balls.add(new Ball("green"));
        balls.add(new Ball("purple"));

        balls.remove(new Ball("yellow"));

        System.out.println(balls.size());
        balls.forEach(System.out::println);
    }
}
