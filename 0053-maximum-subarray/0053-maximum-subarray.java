class Solution {
    public int maxSubArray(int[] nums) {
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