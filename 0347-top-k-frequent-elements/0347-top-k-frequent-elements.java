class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, List<Integer>> bucket = new HashMap<>();
        for (int i = 0; i < nums.length + 1; i++) {
            bucket.computeIfAbsent(i, key -> new ArrayList<>());
        }
        
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num: nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry: frequency.entrySet()) {
            int count = entry.getValue();
            int num = entry.getKey();
            bucket.get(count).add(num);
        }
        
        int indexOfK = 0;
        int[] answer = new int[k];
        for (int i =  nums.length; i >= 0; i--) {
            for(int value: bucket.get(i)) {
                answer[indexOfK++] = value;
                if (indexOfK == k) {
                    return answer;
                }
            }
        }
        
        return answer;
    }
}