package leetcode;

import java.util.Arrays;

public class RotateRightArray {
    public static void main(String[] args) {
        int[] test1 = new int[] {1,2,3,4,5,6,7};
        rotateRight(test1, 3);
        System.out.println(Arrays.toString(test1));
    }

    public static void rotateRight(int[] nums, int k) {
        int size = nums.length;
        int[] copiedNums = Arrays.copyOf(nums, size);

        k = k % size;
        for (int i = 0; i < size; i++) {
            nums[k] = copiedNums[i];
            k = (k + 1) % size;
        }
    }
}
