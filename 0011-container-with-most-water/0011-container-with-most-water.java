class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        
        int answer = 0;
        while (left < right) {
            int width = right - left;
            int area = width * Math.min(height[left], height[right]);
            answer = Math.max(answer, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return answer;
    }
}