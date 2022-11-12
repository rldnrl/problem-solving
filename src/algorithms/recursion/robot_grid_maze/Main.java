package algorithms.recursion.robot_grid_maze;

import java.awt.Point;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // LinkedHashSet에 경로를 저장합니다.
        Set<Point> path1 = new LinkedHashSet<>();

        // 미로를 정의합니다.
        boolean[][] maze1  = new boolean[6][6];
        maze1[2][0]=true;
        maze1[3][0]=true;
        maze1[3][1]=true;
        maze1[3][2]=true;
        maze1[3][3]=true;

        // 경로를 계산하고 표시합니다.
        RobotGridMaze.computePath(5, 5, maze1, path1);

        System.out.println("Computed path1 (plain recursion):");
        path1.forEach(System.out::println);

        Set<Point> path2 = new LinkedHashSet<>();

        boolean[][] maze2  = new boolean[2][2];
        maze2[0][1] = true;

        RobotGridMaze.computePath(1, 1, maze2, path2);

        System.out.println("Computed path2 (plain recursion):");
        path2.forEach(System.out::println);

        Set<Point> visited1 = new HashSet<>();

        // 경로를 계산하고 표시합니다.
        RobotGridMaze.computePath(5, 5, maze1, path1, visited1);

        System.out.println("\nComputed path (Memoization):");
        path1.forEach(System.out::println);

        Set<Point> visited2 = new HashSet<>();

        RobotGridMaze.computePath(1, 1, maze2, path2, visited2);

        System.out.println("Computed path2 (Memoization):");
        path2.forEach(System.out::println);
    }
}