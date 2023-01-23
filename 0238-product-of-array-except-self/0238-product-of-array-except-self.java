class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] leftArray = new int[size];
        int[] rightArray = new int[size];
        
        leftArray[0] = 1;
        for (int i = 1; i < size; i++) {
            leftArray[i] = leftArray[i - 1] * nums[i - 1];
        }
        
        rightArray[size - 1] = 1;
        for (int i = size - 2; i >= 0; i--) {
            rightArray[i] = rightArray[i + 1] * nums[i + 1];
        }
        
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = leftArray[i] * rightArray[i];
        }
        
        return answer;
    }
}