class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        
        if (nums[nums.length-1] != nums.length) {
            return nums.length;
        }
        
        else if (nums[0] != 0) {
            return 0;
        }
        
        int start = Arrays.stream(nums).min().getAsInt();
        int end = Arrays.stream(nums).max().getAsInt();
        
        int answer = 0;
        for (int i = start; i <= end; i++) {
            answer += i;
        }
        
        int numSum = 0;
        for (int i = 0; i < nums.length; i++) {
            answer -= nums[i];
        }
        
        
        return answer;
    }
}