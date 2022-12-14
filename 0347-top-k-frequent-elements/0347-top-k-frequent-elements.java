class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] answer = new int[k];
        Map<Integer, Integer> map = new HashMap<>();

        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());

        entryList.sort((a, b) -> b.getValue() - a.getValue());

        int i = 0;
        for (Map.Entry<Integer, Integer> entry: entryList) {
            if (i != k) {
                answer[i] = entry.getKey();
                i++;
            }
        }

        return answer;
    }
}