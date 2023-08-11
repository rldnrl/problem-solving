class Solution {
    fun findMin(nums: IntArray): Int {
        if (nums.size == 1) {
            return nums[0]
        }

        var left = 0
        var right = nums.size - 1
        val n = nums.size - 1

        if (nums[left] < nums[right]) {
            return nums[0]
        }

        while (right >= left) {
            var mid = left + (right - left) / 2
            
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1]
            }

            if (nums[mid - 1] > nums[mid]) {
                return nums[mid]
            }

            if (nums[mid] > nums[n]) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }

        return Int.MAX_VALUE
    }
}