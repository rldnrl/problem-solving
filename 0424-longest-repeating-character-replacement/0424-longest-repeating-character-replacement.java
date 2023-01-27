class Solution {
    public int characterReplacement(String s, int k) {
        int answer = 0;
        int left = 0;
        int[] count = new int[26];
        
        for (int right = 0; right < s.length(); right++) {
            char r = s.charAt(right);
            count[r - 'A'] += 1;
            
            int maxValueInCount = Arrays.stream(count).max().getAsInt();
            
            while (right - left + 1 - maxValueInCount > k) {
                char l = s.charAt(left);
                count[l - 'A'] -= 1;
                left++;
            }
            
            answer = Math.max(answer, right - left + 1);
        }
        
        return answer;
    }
}