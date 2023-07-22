class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val result = IntArray(k);
        val bucket = mutableMapOf<Int, MutableList<Int>>()
        val frequency = mutableMapOf<Int, Int>()

        for (i in 0..nums.size) {
            bucket.putIfAbsent(i, mutableListOf())
        }

        for (num in nums) {
            frequency[num] = frequency.getOrDefault(num, 0) + 1
        }
        
        

        for (entrySet in frequency.entries) {
            val key = entrySet.key
            val value = entrySet.value
            bucket[value]?.add(key)
        }

        var index = 0
        for (count in nums.size downTo 0) {
            for (element in bucket[count]!!) {
                result[index++] = element
                if (index == k) {
                    return result
                }
            }
        }

        return result
    }
}