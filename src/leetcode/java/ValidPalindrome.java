package leetcode.java;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import java.util.Queue;

public class ValidPalindrome {
    public static String removeNonCharacter(String s) {
        return s.replaceAll("[^A-Za-z0-9]", "");
    }

    public static boolean isPalindrome(String s) {
        String lowerString = s.toLowerCase();
        String lowerStringRemovedNonCharacter = removeNonCharacter(lowerString);

        int right = lowerStringRemovedNonCharacter.length() - 1;
        int left = 0;

        while (left < right) {
            if (lowerStringRemovedNonCharacter.charAt(left) != lowerStringRemovedNonCharacter.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static boolean isPalindrome2(String s) {
        StringBuilder builder = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (Character.isAlphabetic((c)) || Character.isDigit(c)) {
                builder.append(Character.toLowerCase(c));
            }
        }

        return Objects.equals(builder.toString(), builder.reverse().toString());
    }

    public static boolean isPalindrome3(String s) {
        Deque<Character> strs = new ArrayDeque<>();

        for (char c: s.toCharArray()) {
            if (Character.isAlphabetic(c) || Character.isDigit(c)) {
                strs.add(Character.toLowerCase(c));
            }
        }

        while (strs.size() > 1) {
            if (strs.pollFirst() != strs.pollLast()) {
                return false;
            }
        }

        return true;
    }
}
