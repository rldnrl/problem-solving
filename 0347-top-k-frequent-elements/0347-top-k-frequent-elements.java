class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        Map<Integer, List<Integer>> bucket = new HashMap<>();
        
        int size = nums.length;
        
        for (int num: nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        for (int i = 0; i < size + 1; i++) {
            bucket.computeIfAbsent(i, key -> new ArrayList());
        }
        
        for (Map.Entry<Integer, Integer> freqEntry: freq.entrySet()) {
            int num = freqEntry.getKey();
            int count = freqEntry.getValue();
            
            bucket.computeIfAbsent(count, key -> new ArrayList<>());
            bucket.get(count).add(num);
        }
        
        int indexOfK = 0;
        int[] answer = new int[k];
        for (int count = size; count >= 0; count--) {
            for (int num: bucket.get(count)) {
                answer[indexOfK++] = num;
                if (indexOfK == k) {
                    return answer;
                }
            }
        }
        
        return answer;
    }
}