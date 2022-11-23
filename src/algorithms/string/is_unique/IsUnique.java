package algorithms.string.is_unique;

import java.util.HashSet;

public class IsUnique {
    public static boolean isUnique(String s) {
        HashSet<Character> charSet = new HashSet<>();

        for (char c: s.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                if (charSet.contains(c)) {
                    return false;
                }
                charSet.add(c);
            }
        }

        return true;
    }
}
