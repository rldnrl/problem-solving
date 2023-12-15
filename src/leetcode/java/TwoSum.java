package leetcode.java;

import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        // hashMap - Key: Element of Nums, Value: Index of Nums
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            result[0] = i;
            if (hashMap.containsKey(target - nums[i]) && hashMap.get(target - nums[i]) != i) {
                result[1] = hashMap.get(target - nums[i]);
                break;
            }
        }

        return result;
    }

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i]) && hashMap.get(target - nums[i]) != i) {
                return new int[]{i, hashMap.get(target - nums[i])};
            }
        }

        return new int[]{};
    }
}
