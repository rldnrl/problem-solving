package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstUniqueCharacterTest {
    @Test
    void firstUniqCharTest() {
        String s1 = "leetcode";
        Assertions.assertEquals(0, FirstUniqueCharacter.firstUniqChar(s1));

        String s2 = "loveleetcode";
        Assertions.assertEquals(2, FirstUniqueCharacter.firstUniqChar(s2));

        String s3 = "aabb";
        Assertions.assertEquals(-1, FirstUniqueCharacter.firstUniqChar(s3));
    }
}
