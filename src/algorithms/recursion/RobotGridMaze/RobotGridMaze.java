package algorithms.recursion.RobotGridMaze;

import java.awt.*;
import java.util.Set;

public class RobotGridMaze {
    public static boolean computePath(int m, int n, boolean[][] maze, Set<Point> path) {
        // 예외 케이스1
        if (m < 0 || n < 0) {
            return false;
        }

        // 못 가는 부분
        if (maze[m][n]) {
            return false;
        }

       if ((m == 0 && n == 0) || computePath(m - 1, n, maze, path) || computePath(m, n - 1, maze, path)) {
           path.add(new Point(m, n));
           return true;
        }

        return false;
    }

    public static boolean computePath(int m, int n, boolean[][] maze, Set<Point> path, Set<Point> cell) {
        if (m < 0 || n < 0) {
            return false;
        }

        if (maze[m][n]) {
            return false;
        }

        if (cell.contains(new Point(m, n))) {
            return false;
        }

        if ((m == 0 && n == 0) || computePath(m - 1, n, maze, path, cell) || computePath(m, n - 1, maze, path, cell)) {
            path.add(new Point(m, n));
            return true;
        }

        cell.add(new Point(m, n));

        return false;
    }
}
