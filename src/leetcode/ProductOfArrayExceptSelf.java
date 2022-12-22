package leetcode;

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
}
