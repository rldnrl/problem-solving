class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> countOfS = new HashMap<>();
        Map<Character, Integer> countOfT = new HashMap<>();

        for (char c: s.toCharArray()) {
            countOfS.put(c, countOfS.getOrDefault(c, 0) + 1);
        }

        for (char c: t.toCharArray()) {
            countOfT.put(c, countOfT.getOrDefault(c, 0) + 1);
        }

        System.out.print(countOfS);
        System.out.print(countOfT);

        for (char c: countOfS.keySet()) {
            if (!countOfT.containsKey(c)) {
                return false;
            }

            if (!Objects.equals(countOfS.get(c), countOfT.get(c))) {
                return false;
            }
        }

        return true;
    }
}