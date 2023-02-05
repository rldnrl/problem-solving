package leetcode;

import java.util.*;

public class LongestConsecutive {
    /**
     * Time Complexity: O(n^2)
     * Space Complexity: O(n)
     */
    public static int longestConsecutiveWithBruteforce(int[] nums) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();

        for (int num: nums) {
            set.add(num);
        }

        for (int num: nums) {
            if (!set.contains(num - 1)) {
                int length = 0;
                while (set.contains(num + length)) {
                    length++;
                }
                answer = Math.max(answer, length);
            }
        }

        return answer;
    }

    public static int longestConsecutiveWithSort(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        Set<Integer> set = new HashSet<>();
        List<Integer> uniqueNums = new ArrayList<>();
        for (int num: nums) {
            if (!set.contains(num)) {
                set.add(num);
                uniqueNums.add(num);
            }
        }

        int answer = 0;
        int length = 0;
        for (int i = 1; i < uniqueNums.size(); i++) {
            if (uniqueNums.get(i) - uniqueNums.get(i - 1) == 1) {
                length++;
            } else {
                answer = Math.max(answer, length + 1);
                length = 0;
            }
        }

        return Math.max(answer, length + 1);
    }

    public static int longestConsecutiveWithHashSetOptimization(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            set.add(num);
        }

        int answer = 0;
        for (int num: nums) {
            if (!set.contains(num - 1)) {
                int curNum = num;
                int length = 1;
                while (set.contains(curNum + 1)) {
                    curNum++;
                    length++;
                }
                answer = Math.max(answer, length);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{100,4,200,1,3,2};
        System.out.println(longestConsecutiveWithBruteforce(nums1));
        System.out.println(longestConsecutiveWithSort(nums1));
        System.out.println(longestConsecutiveWithHashSetOptimization(nums1));

        int[] nums2 = new int[]{0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutiveWithBruteforce(nums2));
        System.out.println(longestConsecutiveWithSort(nums2));
        System.out.println(longestConsecutiveWithHashSetOptimization(nums2));
    }
}
