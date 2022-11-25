package programmers.lv0;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class CharacterOnlyOnceTest {
    @Test
    void solutionTest() {
        String string1 = "abcabcadc";
        String result1 = "d";
        Assertions.assertEquals(CharacterOnlyOnce.solution(string1), result1);

        String string2 = "abdc";
        String result2 = "abcd";
        Assertions.assertEquals(CharacterOnlyOnce.solution(string2), result2);

        String string3 = "hello";
        String result3 = "eho";
        Assertions.assertEquals(CharacterOnlyOnce.solution(string3), result3);
    }
}