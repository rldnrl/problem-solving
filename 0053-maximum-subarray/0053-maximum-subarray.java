class Solution {
    public int maxSubArray(int[] nums) {
        int answer = nums[0];
        int curSum = 0;
        
        for (int num: nums) {
            if (curSum < 0) {
                curSum = 0;
            }
            curSum += num;
            answer = Math.max(curSum, answer);
        }
        
        return answer;
    }
}