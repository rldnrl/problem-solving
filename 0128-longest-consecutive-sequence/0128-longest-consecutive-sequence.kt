class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if (nums.isEmpty()) {
            return 0
        }
        
        val setNums = mutableSetOf<Int>()
        
        for (num in nums) {
            setNums.add(num)
        }
        
        var answer = 1
        for (num in setNums) {
            if (!setNums.contains(num - 1)) {
                var currentNum = num
                var currentSteak = 1
                while (setNums.contains(currentNum + 1)) {
                    currentNum++
                    currentSteak++
                }
                
                answer = Math.max(answer, currentSteak)
            }
        }
        
        return answer
    }
}