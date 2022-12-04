class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int startIndex = n > 0 ? m : -1;
        
        if (startIndex == -1) {
            return;
        }
        
        int j = 0;
        for (int i = startIndex; i < m + n; i++) {
            nums1[i] = nums2[j];
            j++;
        }

        Arrays.sort(nums1);
    }
}