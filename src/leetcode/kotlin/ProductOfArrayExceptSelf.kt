package leetcode.kotlin

class ProductOfArrayExceptSelf {
    /**
     * Time complexity: O(n)
     * Space complexity: O(n)
     */
    fun solution1(nums: IntArray): IntArray {
        val leftArray = IntArray(nums.size)
        leftArray[0] = 1
        for (i in 1..<nums.size) {
            leftArray[i] = leftArray[i - 1] * nums[i - 1]
        }

        val rightArray = IntArray(nums.size)
        rightArray[nums.size - 1] = 1
        for (i in nums.size - 2 downTo 0) {
            rightArray[i] = rightArray[i + 1] * nums[i + 1]
        }

        val answer = IntArray(nums.size)
        for (i in nums.indices) {
            answer[i] = leftArray[i] * rightArray[i]
        }

        return answer
    }

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    fun solution2(nums: IntArray): IntArray {
        val answer = IntArray(nums.size)
        answer[0] = 1
        for (i in 1..<nums.size) {
            answer[i] = answer[i - 1] * nums[i - 1]
        }

        var right = 1
        for (i in nums.size - 1 downTo 0) {
            answer[i] *= right
            right *= nums[i]
        }

        return answer
    }
}