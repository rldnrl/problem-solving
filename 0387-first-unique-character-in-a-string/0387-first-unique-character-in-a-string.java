class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> chars = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            chars.put(s.charAt(i), chars.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (chars.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        return -1;
    }
}