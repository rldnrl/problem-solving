package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstringWithBruteforce(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (checkRepetition(s, i, j)) {
                    answer = Math.max(answer, j - i + 1);
                }
            }
        }

        return answer;
    }

    public static boolean checkRepetition(String s, int start, int end) {
        Set<Character> set = new HashSet<>();

        for (int i = start; i <= end; i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                return false;
            }
            set.add(c);
        }

        return true;
    }
}
