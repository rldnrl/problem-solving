class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] left = new int[size];
        left[0] = 1;
        for (int i = 1; i < size; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        
        int[] right = new int[size];
        right[size - 1] = 1;
        for (int i = size - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = left[i] * right[i];
        }
        
        return answer;
    }
}