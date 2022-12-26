package leetcode;

import java.util.*;

public class TopKFrequentWords {
    public static class MyComparator implements Comparator<Map.Entry<String, Integer>> {
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

    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> freq = new HashMap<>();

        for (String word: words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        List<Map.Entry<String, Integer>> freqEntryList = new ArrayList<>(freq.entrySet());

        freqEntryList.sort(new MyComparator());

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

    public static void main(String[] args) {
        String[] words1 = new String[]{"i","love","leetcode","i","love","coding"};
        System.out.println(topKFrequent(words1, 2));

        String[] words2 = new String[]{"the","day","is","sunny","the","the","the","sunny","is","is"};
        System.out.println(topKFrequent(words2, 4));
    }
}
