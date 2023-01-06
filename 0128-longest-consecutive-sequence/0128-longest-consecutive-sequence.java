class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        Arrays.sort(nums);
        
        Set<Integer> set = new HashSet<>();
        List<Integer> uniqueNums = new ArrayList<>();
        for (int num: nums) {
            if (!set.contains(num)) {
                uniqueNums.add(num);
                set.add(num);
            }
        }
        
        int answer = 0;
        int length = 0;
        for (int i = 1; i < uniqueNums.size(); i++) {
            if (uniqueNums.get(i) - uniqueNums.get(i - 1) == 1) {
                length++;
            } else {
                answer = Math.max(answer, length + 1);
                length = 0;
            }
        }
        
        answer = Math.max(answer, length + 1);
        
        return answer;
    }
}