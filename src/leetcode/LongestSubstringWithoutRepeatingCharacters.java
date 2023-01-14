package leetcode;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    /**
     * Time Complexity: O(n^3)
     * Space Complexity: O(min(n, m))
     */
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

    public static int lengthOfLongestSubstringWithBruteforceWithSlidingWindow(String s) {
        int answer = 0;

        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            char r = s.charAt(right);
            map.put(r, map.getOrDefault(r, 0) + 1);
            while (map.get(r) > 1) {
                char l = s.charAt(left);
                map.put(l, map.get(l) - 1);
                left++;
            }
            answer = Math.max(answer, right - left + 1);
            right++;
        }

        return answer;
    }

    public static int lengthOfLongestSubstringWithBruteforceWithSlidingWindowOptimization(String s) {
        int answer = 0;

        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(left, map.get(s.charAt(right)));
            }
            answer = Math.max(answer, right - left + 1);
            map.put(s.charAt(right), right + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        System.out.println(lengthOfLongestSubstringWithBruteforce(s1));
        System.out.println(lengthOfLongestSubstringWithBruteforceWithSlidingWindow(s1));
        System.out.println(lengthOfLongestSubstringWithBruteforceWithSlidingWindowOptimization(s1));
    }
}
