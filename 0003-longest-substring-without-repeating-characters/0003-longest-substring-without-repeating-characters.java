class Solution {
    public int lengthOfLongestSubstring(String s) {
        int answer = 0;
        Set<Character> set = new HashSet<>();
        
        int start = 0;
        for (int end = 0; end < s.length(); end++) {
            while (set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start++;
            }
            answer = Math.max(answer, end - start + 1);
            set.add(s.charAt(end));
        }
        
        return answer;
    }
}