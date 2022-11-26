package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximumSubarrayTest {
    @Test
    void maximumSubarrayTest() {
        int[] nums1 = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int result1 = 6;
        Assertions.assertEquals(MaximumSubarray.maxSubarrayWithBruteforce(nums1), result1);

        int[] nums2 = new int[]{1};
        int result2 = 1;
        Assertions.assertEquals(MaximumSubarray.maxSubarrayWithBruteforce(nums2), result2);

        int[] nums3 = new int[]{5,4,-1,7,8};
        int result3 = 23;
        Assertions.assertEquals(MaximumSubarray.maxSubarrayWithBruteforce(nums3), result3);
    }
}
