class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
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
}