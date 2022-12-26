class Solution {
    public static class MyComparator implements Comparator<Map.Entry<String, Integer>> {
        @Override
        public int compare(Map.Entry<String, Integer> m1, Map.Entry<String, Integer> m2) {
            if (m2.getValue() > m1.getValue()) {
                return 1;
            } else if (m2.getValue() < m1.getValue()) {
                return -1;
            } else {
                return m1.getKey().compareToIgnoreCase(m2.getKey());
            }
        }
    }
    
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> freq = new HashMap<>();
        for (String word: words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        
        List<Map.Entry<String, Integer>> freqEntryList = new ArrayList<>(freq.entrySet());
        freqEntryList.sort(new MyComparator());
        
        List<String> answer = new ArrayList<>();
        for (Map.Entry<String, Integer> freqEntry: freqEntryList) {
            answer.add(freqEntry.getKey());
            if (answer.size() == k) {
                return answer;
            }
        }
        
        return answer;
    }
}