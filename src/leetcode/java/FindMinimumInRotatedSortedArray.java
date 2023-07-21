package leetcode.java;

public class FindMinimumInRotatedSortedArray {
    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public int findMin(int[] nums) {
        int answer = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[left] < nums[right]) {
                answer = Math.min(answer, nums[left]);
                break;
            }

            int mid = (left + right) / 2;
            answer = Math.min(answer, nums[mid]);
            if (nums[mid] >= nums[left]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return answer;
    }
}
