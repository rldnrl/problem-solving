class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int[] answer = {0, 0};
        
        while (left < right) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                answer[0] = left + 1;
                answer[1] = right + 1;
                return answer;
            }
        }
        
        return answer;
    }
}