package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ValidAnagram {
    public static boolean isAnagramWithHashMap(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> countOfS = new HashMap<>();
        Map<Character, Integer> countOfT = new HashMap<>();

        for (char c: s.toCharArray()) {
            countOfS.put(c, countOfS.getOrDefault(c, 0) + 1);
        }

        for (char c: t.toCharArray()) {
            countOfT.put(c, countOfT.getOrDefault(c, 0) + 1);
        }

        System.out.print(countOfS);
        System.out.print(countOfT);

        for (Map.Entry<Character, Integer> entry: countOfS.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            if (!countOfT.containsKey(c)) {
                return false;
            }

            if (!Objects.equals(count, countOfT.get(c))) {
                return false;
            }
        }

        return true;
    }
}
