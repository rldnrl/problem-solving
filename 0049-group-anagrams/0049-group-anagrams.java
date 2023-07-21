class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str: strs) {
            char[] alphabets = new char[26];
            for (char c: str.toCharArray()) {
                alphabets[c - 'a']++;
            }
            String key = new String(alphabets);
            map.computeIfAbsent(key, k -> new LinkedList<>());
            map.get(key).add(str);
        }

        return new LinkedList<>(map.values());
    }
}