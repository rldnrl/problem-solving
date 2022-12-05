class Solution {
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        int[] copiedNums = Arrays.copyOf(nums, size);
        
        k = k % size;
        for (int i = 0; i < size; i++) {
             nums[k] = copiedNums[i];
            k = (k + 1) % size;
        }
    }
}