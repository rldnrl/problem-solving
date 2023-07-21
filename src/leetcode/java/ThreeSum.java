package leetcode.java;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSumWithSort(int[] nums) {
        List<List<Integer>> answer = new LinkedList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    List<Integer> list = new LinkedList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    answer.add(list);
                    left++;
                    while (nums[left] == nums[left - 1] && left < right) {
                        left++;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{-1, 0, 1, 2, -1, -4};
        System.out.println(threeSumWithSort(nums1));
    }
}