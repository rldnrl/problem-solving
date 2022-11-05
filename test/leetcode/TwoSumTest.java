package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TwoSumTest {
    @Test
    void twoSumTest() {
        int[] testNums1 = new int[] {2,7,11,15};
        int target1 = 9;
        int[] result1 = new int[] {0, 1};
        Assertions.assertArrayEquals(TwoSum.twoSum(testNums1, target1), result1);

        int[] testNum2 = new int[] {3, 2, 4};
        int target2 = 6;
        int[] result2 =  new int[] {1, 2};
        Assertions.assertArrayEquals(TwoSum.twoSum(testNum2, target2), result2);

        int[] testNum3 = new int[] {3, 3};
        int target3 = 6;
        int[] result3 = new int[] {0, 1};
        Assertions.assertArrayEquals(TwoSum.twoSum(testNum3, target3), result3);
    }
}
