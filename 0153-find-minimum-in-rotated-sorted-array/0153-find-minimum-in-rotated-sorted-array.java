class Solution {
    public int findMin(int[] nums) {
        int answer = nums[0];
        int size = nums.length;
        
        int left = 0;
        int right = size - 1;
        while (left <= right) {
            if (nums[left] < nums[right]) {
                answer = Math.min(answer, nums[left]);
                break;
            }
            
            int mid = (left + right) / 2;
            answer = Math.min(answer, nums[mid]);
            if (nums[mid] >= nums[left]) {
                // search right
                left = mid + 1;
            } else {
                // search left
                right = mid - 1;
            }
        }
        
        return answer;
    }
}