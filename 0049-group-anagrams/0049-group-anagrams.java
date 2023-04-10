class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hashMap = new HashMap<>();
        
        for (String str: strs) {
            char[] chars = new char[26];
            for (char c: str.toCharArray()) {
                chars[c - 'a']++;
            }
            String key = new String(chars);
            hashMap.computeIfAbsent(key, k -> new LinkedList<>());
            hashMap.get(key).add(str);
        }
        
        return new LinkedList<>(hashMap.values());
    }
}