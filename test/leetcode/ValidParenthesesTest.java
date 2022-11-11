package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {
    @Test
    void validParenthesesTest() {
        String s1 = "()";
        Assertions.assertTrue(ValidParentheses.isValid(s1));

        String s2 = "(((";
        Assertions.assertFalse(ValidParentheses.isValid(s2));

        String s3 = "()[]{}";
        Assertions.assertTrue(ValidParentheses.isValid(s3));

        String s4 = "(]";
        Assertions.assertFalse(ValidParentheses.isValid(s4));

        String s5 = "}}}}}";
        Assertions.assertFalse(ValidParentheses.isValid(s5));

        String s6 = "{[{]]]]";
        Assertions.assertFalse(ValidParentheses.isValid(s6));
    }
}
