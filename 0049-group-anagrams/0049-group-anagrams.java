class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str: strs) {
            char[] count = new char[26];
            for (char c: str.toCharArray()) {
                count[c - 'a']++;
            }
            String key = String.valueOf(count);
            map.computeIfAbsent(key, k -> new ArrayList<>());
            map.get(key).add(str);
        }
        
        List<List<String>> answer = new ArrayList<>();
        answer.addAll(map.values());
        
        return answer;
    }
}