package programmers.lv2;

public class TriangleSnail {
    public static int[] solution(int n) {
        int[][] triangle = new int[n][n];
        int x = 0;
        int y = 0;
        int v = 1;

        while (true) {
            // 아래로 이동
            while (true) {
                triangle[y][x] = v++;
                if (y + 1 == n || triangle[y + 1][x] != 0) break;
                y++;
            }

            if (x + 1 == n || triangle[y][x + 1] != 0) break; // 오른쪽으로 이동하지 못하는 경우
            x++;

            // 오른쪽으로 이동
            while (true) {
                triangle[y][x] = v++;
                if (x + 1 == n || triangle[y][x + 1] != 0) break;
                x++;
            }
            if (triangle[y - 1][x - 1] != 0) break; // 왼쪽으로 이동하지 못하는 경우
            x--;
            y--;

            // 왼쪽으로 이동
            while (true) {
                triangle[y][x] = v++;
                if (triangle[y - 1][x - 1] != 0) break;
                y--;
                x--;
            }

            if (y + 1 == n || triangle[y + 1][x] != 0) break; // 아래쪽으로 이동하지 못하는 경우
            y++;
        }

        int[] answer = new int[v - 1];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                answer[index++] = triangle[i][j];
            }
        }

        return answer;
    }

    static final int[] dx = {0, 1, -1};
    static final int[] dy = {1, 0, -1};

    public static int[] solution2(int n) {
        int[][] triangle = new int[n][n];
        int x = 0;
        int y = 0;
        int d = 0;
        int v = 1;

        while (true) {
            triangle[y][x] = v++;
            int nx = x + dx[d];
            int ny = y + dy[d];

            if (nx == n || ny == n || nx == -1 || ny == -1 || triangle[ny][nx] != 0) {
                d = (d + 1) % 3;
                nx = x + dx[d];
                ny = y + dy[d];
                if (nx == n || ny == n || nx == -1 || ny == -1 || triangle[ny][nx] != 0) break;
            }
            x = nx;
            y = ny;
        }

        int[] answer = new int[v - 1];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                answer[index++] = triangle[i][j];
            }
        }

        return answer;
    }
}
