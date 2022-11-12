package algorithms.recursion.robot_grid_all_paths;

public class Main {
    public static void main(String[] args) {
        // 6×6 격자
        int result1 = RobotGridAllPaths.countPaths(6, 6);
        int result2 = RobotGridAllPaths.countPathsBottomUp(6, 6);

        System.out.println("Number of unique paths via plain recursion: " + result1);
        System.out.println("Number of unique paths via Bottom Up: " + result2);

        int result3 = RobotGridAllPaths.countPaths(2, 2);
        int result4 = RobotGridAllPaths.countPaths(3, 3);

        System.out.println("Number of unique paths via plain recursion: " + result3);
        System.out.println("Number of unique paths via plain recursion: " + result4);
    }
}