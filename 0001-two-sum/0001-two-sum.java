class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }
        
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            result[0] = i;
            if (hashMap.containsKey(target - nums[i]) && hashMap.get(target - nums[i]) != i) {
                result[1] = hashMap.get(target - nums[i]);
                break;
            }
        }
        
        return result;
    }
}