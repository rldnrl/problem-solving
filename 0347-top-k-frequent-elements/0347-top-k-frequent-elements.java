class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int size = nums.length;
        
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num: nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        Map<Integer, List<Integer>> bucket = new HashMap<>();
        for (int i = 0; i < size + 1; i++) {
            bucket.computeIfAbsent(i, key -> new ArrayList<>());
        }
        
        for (Map.Entry<Integer, Integer> freqEntry: freq.entrySet()) {
            int count = freqEntry.getValue();
            int num = freqEntry.getKey();
            bucket.get(count).add(num);
        }
        
        int indexOfAnswer = 0;
        int[] answer = new int[k];
        for (int key = size; key >= 0; key--) {
            for (int num: bucket.get(key)) {
                answer[indexOfAnswer++] = num;
                if (indexOfAnswer == k) {
                    return answer;
                }
            }
        }
        
        return answer;
    }
}