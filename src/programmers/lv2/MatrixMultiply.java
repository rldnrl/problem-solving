package programmers.lv2;

public class MatrixMultiply {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row1 = arr1.length;
        int col1 = arr1[0].length;
        int col2 = arr2[0].length;
        int[][] answer = new int[row1][col2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                int sum = 0;
                for (int k = 0; k < col1; k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = sum;
            }
        }

        return answer;
    }

    public int[][] solution2(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[0].length; j++) {
                for (int k = 0; k <  arr1[0].length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return answer;
    }
}
