package algorithms.string.encoding;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] str = "  String   with spaces  ".toCharArray();
        System.out.println("Before: " + Arrays.toString(str));

        char[] result = EncodingString.encodeWhitespaces(str);
        System.out.println("After1: " + Arrays.toString(result));

        char[] result2 = EncodingString.encodeWhitespacesWithReplace(str);
        System.out.println("After2: " + Arrays.toString(result2));
    }
}
