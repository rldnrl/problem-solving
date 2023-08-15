package leetcode.java;

public class TwoSumSortedInput {
    public int[] twoSum(int[] numbers, int target) {
        int[] answer = {0, 0};
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int r = numbers[right];
            int l = numbers[left];
            if (target < r + l) {
                right--;
            } else if (target > r + l) {
                left++;
            } else {
                answer[0] = left + 1;
                answer[1] = right + 1;
                return answer;
            }
        }

        return answer;
    }
}
