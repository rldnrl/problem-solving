package leetcode.kotlin

class LongestConsecutive {
    private fun arrayContains(nums: IntArray, target: Int): Boolean {
        for (num in nums) {
            if (num == target) {
                return true
            }
        }
        return false
    }

    /**
     * Bruteforce
     * Time complexity: O(n^3)
     * Space complexity: O(1)
     */
    fun solution1(nums: IntArray): Int {
        var answer = 0

        for (num in nums) {
            var currentNum = num
            var currentSteak = 1
            while (arrayContains(nums, currentNum)) {
                currentNum++
                currentSteak++
            }

            answer = Math.max(answer, currentSteak)
        }

        return answer
    }

    /**
     * Sort
     * Time complexity: O(n * logn)
     * Space Complexity: O(1) or O(n)
     */
    fun solution2(nums: IntArray): Int {
        if (nums.isEmpty()) {
            return 0
        }

        val sortedNums = nums.sorted()
        var answer = 1
        var currentSteak = 1
        for (i in 1..<sortedNums.size) {
            if (sortedNums[i] != sortedNums[i - 1]) {
                if (sortedNums[i] == sortedNums[i - 1] + 1) {
                    currentSteak++
                } else {
                    answer = Math.max(answer, currentSteak)
                    currentSteak = 1
                }
            }
        }

        return answer
    }

    /**
     * Optimized solution
     * Time complexity: O(n)
     * Space complexity: O(n)
     */
    fun solution3(nums: IntArray): Int {
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