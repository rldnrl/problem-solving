class Solution {
    public boolean isPalindrome(String s) {
        Deque<Character> strs = new ArrayDeque<>();
        
        for (char c: s.toCharArray()) {
            if (Character.isAlphabetic(c) || Character.isDigit(c)) {
                strs.add(Character.toLowerCase(c));
            }
        }
        
        while (strs.size() > 1) {
            if (strs.pollFirst() != strs.pollLast()) {
                return false;
            }
        }
        
        return true;
    }
}