package codility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CyclicRotationTest {
    @Test
    void cyclicRotationTest() {
        int[] A1 = new int[]{3, 8, 9, 7, 6};
        int K1 = 3;
        int[] result1 = {9, 7, 6, 3, 8};
        Assertions.assertArrayEquals(CyclicRotation.solution(A1, K1), result1);

        int[] A2 = new int[]{0, 0, 0};
        int K2 = 1;
        int[] result2 = {0, 0, 0};
        Assertions.assertArrayEquals(CyclicRotation.solution(A2, K2), result2);
    }
}
