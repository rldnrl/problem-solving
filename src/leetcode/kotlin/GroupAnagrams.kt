package leetcode.kotlin

class GroupAnagrams {
    fun solutionWithSorting(strs: Array<String>): List<List<String>> {
        val result = mutableMapOf<String, MutableList<String>>()

        for (str in strs) {
            val key = str.toCharArray().sorted().joinToString("")

            if (!result.containsKey(key)) {
                result[key] = mutableListOf()
            }

            result[key]?.add(str)
        }

        return result.values.toList()
    }

    fun solutionWithArray(strs: Array<String>): List<List<String>> {
        val alphabetSize = 26;
        val result: MutableMap<String, MutableList<String>> = mutableMapOf();

        for (str in strs) {
            val charCount = IntArray(alphabetSize);
            for (c in str) {
                charCount[c - 'a']++;
            }
            val key = charCount.joinToString(",");

            if (!result.containsKey(key)) {
                result[key] = mutableListOf()
            }
            result[key]?.add(str)
        }

        return result.values.toList();
    }
}