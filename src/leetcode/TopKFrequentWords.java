package leetcode;

import java.util.*;

public class TopKFrequentWords {
    public static class MyComparatorByMap implements Comparator<Map.Entry<String, Integer>> {
        @Override
        public int compare(Map.Entry<String, Integer> m1, Map.Entry<String, Integer> m2) {
            if (m1.getValue() < m2.getValue()) {
                return 1;
            } else if (m1.getValue() > m2.getValue()) {
                return -1;
            } else {
                return m1.getKey().compareToIgnoreCase(m2.getKey());
            }
        }
    }

    public static List<String> topKFrequentWithHashMap(String[] words, int k) {
        Map<String, Integer> freq = new HashMap<>();

        for (String word: words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        List<Map.Entry<String, Integer>> freqEntryList = new ArrayList<>(freq.entrySet());

        freqEntryList.sort(new MyComparatorByMap());

        int indexOfAnswer = 0;
        List<String> answer = new ArrayList<>();
        for (Map.Entry<String, Integer> freqEntry: freqEntryList) {
            answer.add(freqEntry.getKey());
            indexOfAnswer++;
            if (indexOfAnswer == k) {
                return answer;
            }
        }

        return answer;
    }

    public static List<String> topKFrequentWordsWithBucketSort(String[] words, int k) {
        Map<String, Integer> freq = new HashMap<>();
        for (String word: words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        Map<Integer, List<String>> bucket = new HashMap<>();
        for (int i = 0; i < words.length + 1; i++) {
            bucket.computeIfAbsent(i, key -> new ArrayList<>());
        }

        for (Map.Entry<String, Integer> freqEntry: freq.entrySet()) {
            int count = freqEntry.getValue();
            String word = freqEntry.getKey();
            bucket.get(count).add(word);
        }

        int indexOfAnswer = 0;
        List<String> answer = new ArrayList<>();
        for (int i = words.length; i >= 0; i--) {
            bucket.get(i).sort(null);
            for (String word: bucket.get(i)) {
                answer.add(word);
                indexOfAnswer++;
                if (indexOfAnswer == k) {
                    return answer;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] words1 = new String[]{"i","love","leetcode","i","love","coding"};
        System.out.println(topKFrequentWithHashMap(words1, 2));
        System.out.println(topKFrequentWordsWithBucketSort(words1, 2));

        String[] words2 = new String[]{"the","day","is","sunny","the","the","the","sunny","is","is"};
        System.out.println(topKFrequentWithHashMap(words2, 4));
        System.out.println(topKFrequentWordsWithBucketSort(words2, 4));
    }
}
