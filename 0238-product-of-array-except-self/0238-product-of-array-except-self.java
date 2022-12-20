class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] prefix = new int[size];
        int[] postfix = new int[size];
        
        prefix[0] = nums[0];
        for (int i = 1; i < size; i++) {
            prefix[i] = prefix[i - 1] * nums[i];
        }
        
        postfix[size - 1] = nums[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            postfix[i] = postfix[i + 1] * nums[i];
        }
        
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                answer[i] = postfix[i + 1];
            } else if (i == size - 1) {
                answer[i] = prefix[i - 1];
            } else {
                answer[i] = prefix[i - 1] * postfix[i + 1];
            }
        }
        
        return answer;
    }
}