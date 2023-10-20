package codility;

import java.util.*;

public class OddOccurrencesInArray {
    static int solution(int[] A) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num: A) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry: countMap.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }
}
