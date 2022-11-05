package leetcode;

import java.util.HashMap;

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
            } else {
                result[0] = 0;
            }
        }

        return result;
    }
}
