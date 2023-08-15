class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val map = mutableMapOf<Char, Int>()

        var left = 0
        var right = 0
        var answer = 0

        while (right < s.length) {
            val r = s[right]
            map[r] = map.getOrDefault(r, 0) + 1
            while (map.get(r)!! > 1) {
                val l = s[left]
                map[l] = map.get(l)!! - 1
                left++
            }

            answer = Math.max(answer, right - left + 1)
            right++
        }

        return answer
    }
}