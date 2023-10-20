package programmers.lv2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatrixMultiplyTest {
    @Test()
    void solutionTest() {
        MatrixMultiply matrixMultiply = new MatrixMultiply();
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};
        int[][] answer1 = {{15, 15}, {15, 15}, {15, 15}};
        Assertions.assertArrayEquals(matrixMultiply.solution(arr1, arr2), answer1);

        int[][] arr3 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
        int[][] arr4 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};
        int[][] answer2 = {{22, 22, 11}, {36, 28, 18}, {29, 20, 14}};
        Assertions.assertArrayEquals(matrixMultiply.solution(arr3, arr4), answer2);

    }

    @Test()
    void solutionTest2() {
        MatrixMultiply matrixMultiply = new MatrixMultiply();
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};
        int[][] answer1 = {{15, 15}, {15, 15}, {15, 15}};
        Assertions.assertArrayEquals(matrixMultiply.solution2(arr1, arr2), answer1);

        int[][] arr3 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
        int[][] arr4 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};
        int[][] answer2 = {{22, 22, 11}, {36, 28, 18}, {29, 20, 14}};
        Assertions.assertArrayEquals(matrixMultiply.solution2(arr3, arr4), answer2);

    }
}
