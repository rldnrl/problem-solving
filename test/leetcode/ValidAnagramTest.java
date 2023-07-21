package leetcode;

import leetcode.java.ValidAnagram;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidAnagramTest {
    @Test
    void isAnagramTest() {
        String s1 = "anagram";
        String t1 = "nagaram";

        Assertions.assertTrue(ValidAnagram.isAnagramWithHashMap(s1, t1));
        Assertions.assertTrue(ValidAnagram.isAnagramWithSort(s1, t1));
        Assertions.assertTrue(ValidAnagram.isAnagramWithFrequency(s1, t1));

        String s2 = "cat";
        String t2 = "rat";
        Assertions.assertFalse(ValidAnagram.isAnagramWithHashMap(s2, t2));
        Assertions.assertFalse(ValidAnagram.isAnagramWithSort(s2, t2));
        Assertions.assertFalse(ValidAnagram.isAnagramWithFrequency(s2, t2));
    }
}
