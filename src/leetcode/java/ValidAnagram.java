package leetcode.java;

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

    public static boolean isAnagramWithSort(String s, String t) {
        char[] arrayOfS = s.toCharArray();
        char[] arrayOfT = t.toCharArray();

        Arrays.sort(arrayOfS);
        Arrays.sort(arrayOfT);

        return Arrays.equals(arrayOfS, arrayOfT);
    }

    public static boolean isAnagramWithFrequency(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c: count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }
}
