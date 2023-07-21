package leetcode.java;

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
}
