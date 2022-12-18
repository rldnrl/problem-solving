class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, List<Integer>> bucket = new HashMap<>();
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int i = 0; i < nums.length + 1; i++) {
            bucket.computeIfAbsent(i, key -> new ArrayList<>());
        }

        for (int num: nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        for (int num: nums) {
            int count = frequency.get(num);
            if (!bucket.get(count).contains(num)) {
                bucket.get(count).add(num);
            }
        }

        int index = 0;
        int[] answer = new int[k];
        for (int count = nums.length; count >= 0; count--) {
            for (int element: bucket.get(count)) {
                if (index != k) {
                    answer[index] = element;
                    index++;
                }
            }
        }

        return answer;
    }
}