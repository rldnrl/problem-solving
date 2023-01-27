class Solution {
    public int characterReplacement(String s, int k) {
        int answer = 0;
        int left = 0;
        Map<Character, Integer> count = new HashMap<>();
        
        for (int right = 0; right < s.length(); right++) {
            char r = s.charAt(right);
            int countOfRight = count.getOrDefault(r, 0);
            count.put(r, countOfRight + 1);
            
            int maxValueInCount = Collections.max(count.values());
            
            while (right - left + 1 - maxValueInCount > k) {
                char l = s.charAt(left);
                int countOfLeft = count.get(l);
                count.put(l, countOfLeft - 1);
                left++;
            }
            
            answer = Math.max(answer, right - left + 1);
        }
        
        return answer;
    }
}