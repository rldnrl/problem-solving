class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val answer = IntArray(nums.size)
        answer[0] = 1
        for (i in 1..nums.size - 1) {
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