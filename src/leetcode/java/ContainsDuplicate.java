package leetcode.java;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> countOfNums = new HashMap<>();

        for (int num : nums) {
            if (!countOfNums.containsKey(num)) {
                countOfNums.put(num, 1);
            } else {
                int count = countOfNums.get(num);
                countOfNums.put(num, count + 1);
            }
        }

        return countOfNums.values().stream().anyMatch(x -> x > 1);
    }

    public static boolean containsDuplicateWithHashSet(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int num: nums) {
            if (hashSet.contains(num)) {
                return true;
            }
            hashSet.add(num);
        }

        return false;
    }
}
