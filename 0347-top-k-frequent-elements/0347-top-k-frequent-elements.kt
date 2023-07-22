class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val result = IntArray(k)
        val map = mutableMapOf<Int, Int>()
        
        for (num in nums) {
            map[num] = map.getOrDefault(num, 0) + 1
        }
        
        val sortedEntries = map.entries.toList().sortedBy { -it.value }
        
        var i = 0
        for (entry in sortedEntries) {
            result[i++] = entry.key
            if (i == k) {
                return result
            }
        }
        
        return result
    }
}