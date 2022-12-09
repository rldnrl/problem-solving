class Solution {
    public static String sortString(String s) {
        String[] arrayOfS = s.split("");
        Arrays.sort(arrayOfS);
        return String.join("", arrayOfS);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (String s: strs) {
            String sortedS = sortString(s);
            if (map.containsKey(sortedS)) {
                map.get(sortedS).add(s);
            } else {
                List<String> newValue = new ArrayList<>();
                newValue.add(s);
                map.put(sortedS, newValue);
            }
        }

        for (Map.Entry<String, List<String>> entry: map.entrySet()) {
            result.add(entry.getValue());
        }

        return result;
    }
}