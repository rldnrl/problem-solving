package leetcode.java;

import java.util.*;

public class IsIsomorphic {
    static boolean solution1(String s, String t) {
        Map<Character, Character> hashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            char value = t.charAt(i);
            if (hashMap.containsKey(key) && hashMap.get(key) != value) {
                return false;
            }
            hashMap.put(key, value);
        }

        Set<Character> setS = new HashSet<>();
        Set<Character> setT = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            setS.add(s.charAt(i));
            setT.add(t.charAt(i));
        }

        if (!Objects.equals(setS.size(), setT.size())) {
            return false;
        }

        char[] newS = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            newS[i] = hashMap.get(key);

        }

        return Objects.equals(new String(newS), t);
    }
}
