class Solution {
    static String sorted(String str) {
        String[] newStringParts = str.split("");
        Arrays.sort(newStringParts);
        return String.join("", newStringParts);
    }
    
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new LinkedList<>();
        Map<String, List<String>> hashMap = new HashMap<>();
        
        for (String str: strs) {
            String sortedStr = sorted(str);
            hashMap.computeIfAbsent(sortedStr, (k) -> new LinkedList());
            hashMap.get(sortedStr).add(str);
        }
        
        for (Map.Entry<String, List<String>> entry: hashMap.entrySet()) {
            result.add(entry.getValue());
        }
        
        return result;
    }
}