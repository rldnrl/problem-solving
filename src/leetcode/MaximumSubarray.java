package leetcode;

/**
 * <a href="https://leetcode.com/problems/maximum-subarray/">Maximum Subarray</a>
 * Time Complex: O(n^3)
 */
public class MaximumSubarray {
    public static int maxSubarrayWithBruteforce(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k < j + 1; k++) {
                    sum += nums[k];
                }
                max = Math.max(sum, max);
            }
        }

        return max;
    }
}
