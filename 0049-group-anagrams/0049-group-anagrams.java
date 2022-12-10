class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList();
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str: strs) {
            char[] count = new char[26];
            for (char c: str.toCharArray()) {
                count[c - 'a']++;
            }
            String key = new String(count);
            map.computeIfAbsent(key, k -> new ArrayList());
            map.get(key).add(str);
        }
        
        result.addAll(map.values());
        
        return result;
    }
}