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
            map.computeIfAbsent(sortedS, k -> new ArrayList<>());
            map.get(sortedS).add(s);
        }

        for (Map.Entry<String, List<String>> entry: map.entrySet()) {
            result.add(entry.getValue());
        }

        return result;
    }
}