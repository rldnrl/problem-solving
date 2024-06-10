class Solution {
    public int search(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length - 1;
        
        while (startIndex <= endIndex) {
            int middleIndex = (startIndex + endIndex) / 2;
            
            if (nums[middleIndex] == target) {
                return middleIndex;
            }
            
            if (nums[startIndex] <= nums[middleIndex]) {
                if (target < nums[startIndex] || target > nums[middleIndex]) {
                    startIndex = middleIndex + 1;
                } else {
                    endIndex = middleIndex - 1;
                }
            } else {
                if (target > nums[endIndex] || target < nums[middleIndex]) {
                    endIndex = middleIndex - 1;
                } else {
                    startIndex = middleIndex;
                }
            }
        }
        
        return -1;
    }
}