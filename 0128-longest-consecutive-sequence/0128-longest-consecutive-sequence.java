class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        
        for (int num: nums) {
            numsSet.add(num);
        }
        
        int longest = 0; 
        for (int num: nums) {
            if (!numsSet.contains(num - 1)) {
                int length = 0;
                while (numsSet.contains(num + length)) {
                    length++;
                }
                
                longest = Math.max(length, longest);
            }
        }
        
        return longest;
    }
}