class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num: nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        Map<Integer, List<Integer>> bucket = new HashMap<>();
        for (int i = 0; i < nums.length + 1; i++) {
            bucket.computeIfAbsent(i, key -> new ArrayList<>());
        }
        
        for (Map.Entry<Integer, Integer> freqEntry: freq.entrySet()) {
            int num = freqEntry.getKey();
            int count = freqEntry.getValue();
            bucket.get(count).add(num);
        }
        
        int indexOfAnswer = 0;
        int[] answer = new int[k];
        for (int i = nums.length; i >= 0; i--) {
            for (int num: bucket.get(i)) {
                answer[indexOfAnswer++] = num;
                if (indexOfAnswer == k) {
                    return answer;
                }
            }
        }
        
        return answer;
    }
}