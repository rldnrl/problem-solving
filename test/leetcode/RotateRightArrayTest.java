package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RotateRightArrayTest {
    @Test
    void rotateRightTest() {
        int[] testNums1 = new int[] {1, 2, 3, 4, 5, 6, 7};
        int[] testNums1Result = new int[] {5,6,7,1,2,3,4};
        RotateRightArray.rotateRight(testNums1, 3);
        Assertions.assertArrayEquals(testNums1, testNums1Result);

        int[] testNum2 = new int[] {-1,-100,3,99};
        int[] testNum2Result = new int[] {3,99,-1,-100};
        RotateRightArray.rotateRight(testNum2, 2);
        Assertions.assertArrayEquals(testNum2, testNum2Result);
    }

    @Test
    void rotateWithBruteforceTest() {
        int[] testNums1 = new int[] {1, 2, 3, 4, 5, 6, 7};
        int[] testNums1Result = new int[] {5,6,7,1,2,3,4};
        RotateRightArray.rotateRightWithBruteforce(testNums1, 3);
        Assertions.assertArrayEquals(testNums1, testNums1Result);

        int[] testNum2 = new int[] {-1,-100,3,99};
        int[] testNum2Result = new int[] {3,99,-1,-100};
        RotateRightArray.rotateRightWithBruteforce(testNum2, 2);
        Assertions.assertArrayEquals(testNum2, testNum2Result);
    }
}
