package leetcode.java;

import java.util.*;

public class TopKFrequencyElements {
    /**
     * Time Complexity: O(n * logn)
     * Space Complexity: O(n)
     */
    public static int[] topKFrequentWithHashMap(int[] nums, int k) {
        int[] answer = new int[k];
        Map<Integer, Integer> map = new HashMap<>();

        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());

        entryList.sort((a, b) -> b.getValue() - a.getValue());

        int i = 0;
        for (Map.Entry<Integer, Integer> entry: entryList) {
            answer[i++] = entry.getKey();
            if (i == k) {
                return answer;
            }
        }

        return answer;
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static int[] topKFrequentWithBucketSort(int[] nums, int k) {
        Map<Integer, List<Integer>> bucket = new HashMap<>();
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int i = 0; i < nums.length + 1; i++) {
            bucket.computeIfAbsent(i, key -> new ArrayList<>());
        }

        for (int num: nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry: frequency.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            bucket.get(count).add(num);
        }

        int index = 0;
        int[] answer = new int[k];
        for (int count = nums.length; count >= 0; count--) {
            for (int element: bucket.get(count)) {
                answer[index++] = element;
                if (index == k) {
                    return answer;
                }
            }
        }

        return answer;
    }

    public static int[] topKFrequentElementsWithHeap(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int num: nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        Queue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(count::get));

        for (int num: count.keySet()) {
            heap.add(num);
            if (heap.size() > k) heap.poll();
        }

        int[] answer = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            if (!heap.isEmpty()) {
                answer[i] = heap.poll();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,1,1,2,2,3};
        System.out.println(Arrays.toString(topKFrequentWithHashMap(nums1, 2)));
        System.out.println(Arrays.toString(topKFrequentWithBucketSort(nums1, 2)));
        System.out.println(Arrays.toString(topKFrequentElementsWithHeap(nums1, 2)));

        int[] nums2 = new int[]{1};
        System.out.println(Arrays.toString(topKFrequentWithHashMap(nums2, 1)));
        System.out.println(Arrays.toString(topKFrequentWithBucketSort(nums2, 1)));
        System.out.println(Arrays.toString(topKFrequentElementsWithHeap(nums2, 1)));

        int[] nums3 = new int[]{4,1,-1,2,-1,2,3};
        System.out.println(Arrays.toString(topKFrequentWithHashMap(nums3, 2)));
        System.out.println(Arrays.toString(topKFrequentWithBucketSort(nums3, 2)));
        System.out.println(Arrays.toString(topKFrequentElementsWithHeap(nums3, 2)));
    }
}
