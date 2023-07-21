package leetcode.java;

/**
 * <a href="https://leetcode.com/problems/maximum-subarray/">Maximum Subarray</a>
 */
public class MaximumSubarray {
    /**
     * Time Complexity: O(n^3)
     */
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

    /**
     * Time Complexity: O(n^2)
     */
    public static int maxSubarrayWithBruteforceOptimized(int[] nums) {
        int maxSub = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int curSum = 0;
            for (int j = i; j < nums.length; j++) {
                curSum += nums[j];
                maxSub = Math.max(maxSub, curSum);
            }
        }

        return maxSub;
    }

    /**
     * Time Complexity: O(n)
     */
    public static int maxSubarrayWithSlidingWindow(int[] nums) {
        int maxSub = nums[0];
        int curSum = 0;

        for (int element: nums) {
            if (curSum < 0) {
                curSum = 0;
            }
            curSum += element;
            maxSub = Math.max(maxSub, curSum);
        }

        return maxSub;
    }
}
