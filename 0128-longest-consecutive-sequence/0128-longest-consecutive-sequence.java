class Solution {
    public int longestConsecutive(int[] nums) {
        int answer = 0;
        
        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            set.add(num);
        }
        
        for (int num: nums) {
            if (!set.contains(num - 1)) {
                int curNum = num;
                int length = 1;
                while (set.contains(curNum + 1)) {
                    curNum++;
                    length++;
                }
                answer = Math.max(answer, length);
            }
        }
        
        return answer;
    }
}