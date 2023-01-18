class Solution {
    public int characterReplacement(String s, int k) {
        int answer = 0;
        int left = 0;
        
        Map<Character, Integer> freq = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
            
            int maxValue = Collections.max(freq.values());
            while (right - left + 1 - maxValue > k) {
                freq.put(s.charAt(left), freq.get(s.charAt(left)) - 1);
                left++;
            }
            
            answer = Math.max(answer, right - left + 1);
        }
        
        return answer;
    }
}