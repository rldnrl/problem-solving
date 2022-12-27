class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> freq = new HashMap<>();
        for (String word: words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        
        Map<Integer, List<String>> bucket = new HashMap<>();
        for (int i = 0; i < words.length + 1; i++) {
            bucket.computeIfAbsent(i, key -> new ArrayList<>());
        }
        
        for (Map.Entry<String, Integer> freqEntry: freq.entrySet()) {
            String word = freqEntry.getKey();
            int count = freqEntry.getValue();
            bucket.get(count).add(word);
        }
        
        List<String> answer = new ArrayList<>();
        for (int i = words.length; i >= 0; i--) {
            bucket.get(i).sort(null);
            for (String word: bucket.get(i)) {
                answer.add(word);
                if (answer.size() == k) {
                    return answer;
                }
            }
        }
        
        return answer;
    }
}