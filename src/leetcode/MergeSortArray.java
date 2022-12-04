package leetcode;

import java.util.Arrays;

public class MergeSortArray {
    /**
     * Time Complexity: O((m + n)log(m + n))
     * Space Complexity: O(n) - 대부분 언어에서 Sort 알고리즘의 Space Complexity는 O(n).
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }

        Arrays.sort(nums1);
    }
}
