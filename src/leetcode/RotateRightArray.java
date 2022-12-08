package leetcode;

import java.util.Arrays;

public class RotateRightArray {
    public static void rotateRight(int[] nums, int k) {
        int size = nums.length;
        int[] copiedNums = Arrays.copyOf(nums, size);

        k = k % size;
        for (int i = 0; i < size; i++) {
            nums[k] = copiedNums[i];
            k = (k + 1) % size;
        }
    }

    public static void rotateRightWithBruteforce(int[] nums, int k) {
        int size = nums.length;

        while (k > 0) {
            int last = nums[size - 1];
            for (int i = size - 2; i >= 0; i--) {
                nums[i+1] = nums[i];
            }
            nums[0] = last;
            k--;
        }
    }
}
