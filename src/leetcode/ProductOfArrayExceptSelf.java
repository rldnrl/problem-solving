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
    public static int[] productExceptSelfWithPrefixPostfix1(int[] nums) {
        int size = nums.length;
        int[] prefixArray = new int[size];
        int[] postfixArray = new int[size];


        prefixArray[0] = nums[0];
        for (int i = 1; i < size; i++) {
            prefixArray[i] = prefixArray[i - 1] * nums[i];
        }

        postfixArray[size - 1] = nums[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            postfixArray[i] = postfixArray[i + 1] * nums[i];
        }

        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                answer[i] = postfixArray[i + 1];
            } else if (i == size - 1) {
                answer[i] = prefixArray[i - 1];
            } else {
                answer[i] = prefixArray[i - 1] * postfixArray[i + 1];
            }
        }

        return answer;
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int[] productExceptSelfWithPrefixPostfix2(int[] nums) {
        int size = nums.length;
        int[] answer = new int[size];

        for (int i = 0; i < size; i++) {
            answer[i] = 1;
        }

        int prefix = 1;
        for (int i = 0; i < size; i++) {
            answer[i] = prefix;
            prefix = prefix * nums[i];
        }

        int postfix = 1;
        for (int i = size - 1; i >= 0; i--) {
            answer[i] = answer[i] * postfix;
            postfix = postfix * nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,4};
        int[] answer1 = new int[]{24,12,8,6};
        System.out.println(Arrays.equals(productExceptSelfWithBruteforce(nums1), answer1));
        System.out.println(Arrays.equals(productExceptSelfWithPrefixPostfix1(nums1), answer1));
        System.out.println(Arrays.equals(productExceptSelfWithPrefixPostfix2(nums1), answer1));

        int[] nums2 = new int[]{-1,1,0,-3,3};
        int[] answer2 = new int[]{0,0,9,0,0};
        System.out.println(Arrays.equals(productExceptSelfWithBruteforce(nums2), answer2));
        System.out.println(Arrays.equals(productExceptSelfWithPrefixPostfix1(nums2), answer2));
        System.out.println(Arrays.equals(productExceptSelfWithPrefixPostfix2(nums2), answer2));
    }
}
