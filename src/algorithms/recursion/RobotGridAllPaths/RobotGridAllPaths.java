package algorithms.recursion.RobotGridAllPaths;

public class RobotGridAllPaths {
    public static int countPaths(int m, int n) {
        if (m <= 0 || n <= 0) {
            return -1;
        }

        if (m == 1 || n == 1) {
            return 1;
        }

        return countPaths(m - 1, n) + countPaths(m, n - 1);
    }

    public static int countPathsBottomUp(int m, int n) {
        if (m <= 0 || n <= 0) {
            return -1;
        }

        int[][] count = new int[m][n];

        for (int row = 0; row < m; row++) {
            count[row][0] = 1;
        }

        for (int col = 0; col < n; col++) {
            count[0][col] = 1;
        }

        for (int row = 1; row < m; row++) {
            for (int col = 1; col < n; col++) {
                count[row][col] = count[row - 1][col] + count[row][col - 1];
            }
        }

        return count[m - 1][n - 1];
    }
}
