class Solution {
    public int longestConsecutive(int[] nums) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i] - 1)) {
                int length = 0;
                while (set.contains(nums[i] + length)) {
                    length++;
                }
                answer = Math.max(answer, length);
            }
        }
        
        return answer;
    }
}