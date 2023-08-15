class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left = 0;
        var right = numbers.size - 1;
        val answer = intArrayOf(0, 0)

        while (left < right) {
            val r = numbers[right]
            val l = numbers[left]

            if (target < r + l) {
                right--
            } else if (target > r + l) {
                left++
            } else {
                answer[0] = left + 1
                answer[1] = right + 1
                return answer
            }
        }

        return answer
    }
}