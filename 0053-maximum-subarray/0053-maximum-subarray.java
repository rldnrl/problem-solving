class Solution {
    public int maxSubArray(int[] nums) {
        int answer = nums[0];
        int curSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            curSum = Math.max(curSum + num, num);
            answer = Math.max(answer, curSum);
        }
        
        return answer;
    }
}