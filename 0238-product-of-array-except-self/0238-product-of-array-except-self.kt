class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val leftArray = IntArray(nums.size)
        leftArray[0] = 1
        for (i in 1..nums.size - 1) {
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
}