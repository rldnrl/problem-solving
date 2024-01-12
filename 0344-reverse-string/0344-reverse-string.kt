class Solution {
    fun reverseString(s: CharArray): Unit {
        var left = 0
        var right = s.size - 1
        
        while (left < right) {
            s[left] = s[right].also { s[right] = s[left] }
            right--
            left++
        }
    }
}