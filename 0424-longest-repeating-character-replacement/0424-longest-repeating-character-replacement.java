class Solution {
    public int characterReplacement(String s, int k) {
        int answer = 0;
        int left = 0;
        
        Map<Character, Integer> count = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char r = s.charAt(right);
            count.put(r, count.getOrDefault(r, 0) + 1);
            
            int maxCount = Collections.max(count.values());
            while (right - left + 1 - maxCount > k) {
                char l = s.charAt(left);
                int countOfL = count.get(l);
                count.put(l, countOfL - 1);
                left++;
            }
            
            answer = Math.max(answer, right - left + 1);
        }
        
        return answer;
    }
}