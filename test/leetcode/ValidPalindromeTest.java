package leetcode;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static leetcode.java.ValidPalindrome.*;

public class ValidPalindromeTest {
    @Test
    public void validPalindrome() {
        String testString1 = new String("A man, a plan, a canal: Panama");
        Assertions.assertTrue(isPalindrome(testString1));

        String testString2 = new String("race a car");
        Assertions.assertFalse(isPalindrome(testString2));

        String testString3 = new String(" ");
        Assertions.assertTrue(isPalindrome(testString3));

        String testString4 = new String("aa");
        Assertions.assertTrue(isPalindrome(testString4));
    }

    @Test
    public void validPalindrome2() {
        String testString1 = new String("A man, a plan, a canal: Panama");
        Assertions.assertTrue(isPalindrome2(testString1));

        String testString2 = new String("race a car");
        Assertions.assertFalse(isPalindrome2(testString2));

        String testString3 = new String(" ");
        Assertions.assertTrue(isPalindrome2(testString3));

        String testString4 = new String("aa");
        Assertions.assertTrue(isPalindrome2(testString4));
    }

    @Test
    public void validPalindrome3() {
        String testString1 = new String("A man, a plan, a canal: Panama");
        Assertions.assertTrue(isPalindrome3(testString1));

        String testString2 = new String("race a car");
        Assertions.assertFalse(isPalindrome3(testString2));

        String testString3 = new String(" ");
        Assertions.assertTrue(isPalindrome3(testString3));

        String testString4 = new String("aa");
        Assertions.assertTrue(isPalindrome3(testString4));
    }
}
