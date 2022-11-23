class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> charsMap = new HashMap<>();
        
        for (char c: s.toCharArray()) {
            charsMap.put(c, charsMap.getOrDefault(c, 0) + 1);
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (charsMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        return -1;
    }
}