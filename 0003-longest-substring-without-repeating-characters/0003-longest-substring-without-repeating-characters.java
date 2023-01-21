class Solution {
    public int lengthOfLongestSubstring(String s) {
        int answer = 0;
        Set<Character> set = new HashSet<>();
        
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            char r = s.charAt(right);
            while (set.contains(r)) {
                char l = s.charAt(left);
                set.remove(l);
                left++;
            }
            answer = Math.max(answer, right - left + 1);
            set.add(r);
            right++;
        }
        
        return answer;
    }
}