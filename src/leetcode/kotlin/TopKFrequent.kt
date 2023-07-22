package leetcode.kotlin

class TopKFrequent {
    fun solutionWithSort(nums: IntArray, k: Int): IntArray {
        val result = IntArray(k)
        val map = mutableMapOf<Int, Int>()

        for (num in nums) {
            map[num] = map.getOrDefault(num, 0) + 1
        }

        val sortedEntries = map.entries.toList().sortedBy { -it.value }

        var i = 0;
        for (entry in sortedEntries) {
            result[i++] = entry.key
            if (i == k) {
                return result
            }
        }

        return result
    }

    fun solutionWithBucketSort(nums: IntArray, k: Int): IntArray {
        val answer = IntArray(k);
        val bucket: MutableMap<Int, MutableList<Int>> = mutableMapOf()
        val freq: MutableMap<Int, Int> = mutableMapOf()

        for (i in 0..nums.size) {
            bucket.putIfAbsent(i, mutableListOf())
        }

        for (num in nums) {
            freq[num] = freq.getOrDefault(num, 0) + 1
        }

        for (entries in freq.entries) {
            val num = entries.key
            val count = entries.value
            bucket[count]?.add(num)
        }

        var i = 0
        for (num in nums.size downTo 0) {
            for (element in bucket[num]!!) {
                answer[i++] = element
                if (i == k) {
                    return answer
                }
            }
        }

        return answer
    }
}