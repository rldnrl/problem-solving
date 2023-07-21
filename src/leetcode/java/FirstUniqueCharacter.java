package leetcode.java;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> chars = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            chars.put(currentChar, chars.getOrDefault(currentChar, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (chars.get(currentChar) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static int firstUniqCharWithMinValue(String s) {
        HashMap<Character, Integer> chars = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (!chars.containsKey(currentChar)) {
                chars.put(currentChar, i);
            } else {
                chars.put(currentChar, -1);
            }
        }

        int min = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry: chars.entrySet()) {
            if (entry.getValue() > -1 && entry.getValue() < min) {
                min = entry.getValue();
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
