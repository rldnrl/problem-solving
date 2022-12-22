class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            answer[i] = 1;
        }
        
        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            answer[i] = prefix;
            prefix = prefix * nums[i];
        }
        
        int postfix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] = answer[i] * postfix;
            postfix = postfix * nums[i];
        }
        
        return answer;
    }
}