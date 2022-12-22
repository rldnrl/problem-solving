package leetcode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    /**
     * Time Complexity: O(n^2)
     * Space Complexity: O(n)
     */
    public static int[] productExceptSelfWithBruteforce(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int mul = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    mul *= nums[j];
                }
            }
            answer[i] = mul;
        }

        return answer;
    }


    /**
     * Time Complexity: O(n);
     * Space Complexity: O(n)
     */
    public static int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] left = new int[size];
        int[] right = new int[size];


        left[0] = 1;
        for (int i = 1; i < size; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        right[size - 1] = 1;
        for (int i = size - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        int[] answer = new int[size];
        for (int i = 0; i < nums.length; i++) {
            answer[i] = left[i] * right[i];
        }

        return answer;
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int[] optimizedProductExceptSelf(int[] nums) {
        int size = nums.length;
        int[] answer = new int[size];

        answer[0] = 1;
        for (int i = 1; i < size; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        int right = 1;
        for (int i = size - 1; i >= 0; i--) {
            answer[i] = answer[i] * right;
            right = right * nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,4};
        int[] answer1 = new int[]{24,12,8,6};
        System.out.println(Arrays.equals(productExceptSelfWithBruteforce(nums1), answer1));
        System.out.println(Arrays.equals(productExceptSelf(nums1), answer1));
        System.out.println(Arrays.equals(optimizedProductExceptSelf(nums1), answer1));

        int[] nums2 = new int[]{-1,1,0,-3,3};
        int[] answer2 = new int[]{0,0,9,0,0};
        System.out.println(Arrays.equals(productExceptSelfWithBruteforce(nums2), answer2));
        System.out.println(Arrays.equals(productExceptSelf(nums2), answer2));
        System.out.println(Arrays.equals(optimizedProductExceptSelf(nums2), answer2));
    }
}
