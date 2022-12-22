class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] answer = new int[size];
        
        answer[0] = 1;
        for (int i = 1; i < size; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }
        
        int right = 1;
        for (int i = size - 1; i >= 0; i--) {
            answer[i] = answer[i] * right;
            right = right * nums[i];
        }
        
        return answer;
    }
}