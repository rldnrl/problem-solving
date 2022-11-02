package algorithms.recursion.RobotGridMaze;

import java.awt.Point;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /* R - 로봇, # - 미로, T - 도달 위치
        (m, n) +           +
               |R| | | | | |
               |R|R| | | | |
               |#|R|R|R|R| |
               |#|#|#|#|R| |
               | | | | |R| |
               | | | | |R|T|
               +           + (0, 0)
        */

        // LinkedHashSet에 경로를 저장합니다.
        Set<Point> path = new LinkedHashSet<>();

        // 미로를 정의합니다.
        boolean[][] maze  = new boolean[6][6];
        maze[2][0]=true;
        maze[3][0]=true;
        maze[3][1]=true;
        maze[3][2]=true;
        maze[3][3]=true;

        // 경로를 계산하고 표시합니다.
        RobotGridMaze.computePath(5, 5, maze, path);

        System.out.println("Computed path (plain recursion):");
        path.forEach(System.out::println);
    }
}