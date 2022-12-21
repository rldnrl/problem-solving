class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 문제를 단순화 시키기.
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str: strs) {
            String[] strArray = str.split("");
            Arrays.sort(strArray);
            String sortedStr = String.join("", strArray);
            map.computeIfAbsent(sortedStr, key -> new ArrayList<>());
            map.get(sortedStr).add(str);
        }
        
        List<List<String>> answer = new ArrayList<>();
        answer.addAll(map.values());
        
        return answer;
    }
}