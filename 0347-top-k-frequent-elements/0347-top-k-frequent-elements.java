class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num: nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        List<Map.Entry<Integer, Integer>> freqEntryList = new ArrayList<>(freq.entrySet());
        
        freqEntryList.sort((a, b) -> b.getValue() - a.getValue());
        
        int indexOfAnswer = 0;
        int[] answer = new int[k];
        for (Map.Entry<Integer, Integer> freqEntry: freqEntryList) {
            answer[indexOfAnswer++] = freqEntry.getKey();
            if (indexOfAnswer == k) {
                return answer;
            }
        }
        
        return answer;
    }
}