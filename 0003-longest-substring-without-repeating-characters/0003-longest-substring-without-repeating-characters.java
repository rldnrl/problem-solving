class Solution {
    public int lengthOfLongestSubstring(String s) {
        int answer = 0;
        Set<Character> set = new HashSet<>();
        
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char r = s.charAt(right);
            
            while (set.contains(r)) {
                char l = s.charAt(left);
                set.remove(l);
                left++;
            }
            
            set.add(r);
            answer = Math.max(answer, right - left + 1);
        }
        
        return answer;
    }
}