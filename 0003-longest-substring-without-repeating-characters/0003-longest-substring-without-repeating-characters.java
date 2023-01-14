class Solution {
    public int lengthOfLongestSubstring(String s) {
        int answer = 0;
        Map<Character, Integer> map = new HashMap<>();
        
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(map.get(s.charAt(right)), left);
            }
            
            answer = Math.max(answer, right - left + 1);
            map.put(s.charAt(right), right + 1);
        }
        
        return answer;
    }
}