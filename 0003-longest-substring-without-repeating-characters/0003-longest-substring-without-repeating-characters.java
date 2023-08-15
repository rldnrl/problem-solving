class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int answer = 0;
        
        while (right < s.length()) {
            char r = s.charAt(right);
            map.put(r, map.getOrDefault(r, 0) + 1);
            while (map.get(r) > 1) {
                char l = s.charAt(left);
                map.put(l, map.get(l) - 1);
                left++;
            }
            answer = Math.max(answer, right - left + 1);
            right++;
        }
        
        return answer;
    }
}