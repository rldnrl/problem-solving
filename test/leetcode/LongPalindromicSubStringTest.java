package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongPalindromicSubStringTest {
    @Test
    void longPalindromicSubStringTest() {
        String string1 = "babad";
        String result1 = "bab";
        Assertions.assertEquals(LongPalindromicSubString.longestPalindrome(string1), result1);

        String string2 = "cbbd";
        String result2 = "bb";
        Assertions.assertEquals(LongPalindromicSubString.longestPalindrome(string2), result2);
    }
}
