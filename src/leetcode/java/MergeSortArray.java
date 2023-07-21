package leetcode.java;

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

    public void mergeWithTwoPointer(int[] nums1, int m, int[] nums2, int n) {
        int lastIndex = m + n - 1;

        while (m > 0 && n > 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[lastIndex] = nums1[m - 1];
                m--;
            } else {
                nums1[lastIndex] = nums2[n - 1];
                n--;
            }
            lastIndex--;
        }

        while (n > 0) {
            nums1[lastIndex] = nums2[n - 1];
            n--;
            lastIndex--;
        }
    }
}
