package leetcode.java;

import java.util.LinkedList;
import java.util.Queue;

public class NumIslands {
    int solution(char[][] grid) {
        int answer = 0;

        int nr = grid.length;
        int nc = grid[0].length;
        for (int r = 0; r < nr; r++) {
            for (int c = 0; c < nc; c++) {
                if (grid[r][c] == '1') {
                    answer++;
                    grid[r][c] = '0';
                    Queue<Integer> q = new LinkedList<>();
                    q.add(r * nc + c);

                    while (!q.isEmpty()) {
                        int id = q.remove();
                        int row = id / nc;
                        int col = id % nc;
                        if (row - 1 >= 0 && grid[row - 1][col] == '1') {
                            q.add((row - 1) * nc + col);
                            grid[row - 1][col] = '0';
                        }
                        if (row + 1 < nr && grid[row + 1][col] == '1') {
                            q.add((row + 1) * nc + col);
                            grid[row + 1][col] = '0';
                        }
                        if (col - 1 >= 0 && grid[row][col - 1] == '1') {
                            q.add(row * nc + (col - 1));
                            grid[row][col - 1] = '0';
                        }
                        if (col + 1 < nc && grid[row][col + 1] == '1') {
                            q.add(row * nc + (col + 1));
                            grid[row][col + 1] = '0';
                        }
                    }
                }
            }
        }
        return answer;
    }
}
