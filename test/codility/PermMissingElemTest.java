package codility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PermMissingElemTest {
    @Test
    void solution() {
        int[] input1 = {};
        Assertions.assertEquals(PermMissingElem.solution(input1), 1);

        int[] input2 = {1, 2, 3, 5};
        Assertions.assertEquals(PermMissingElem.solution(input2), 4);
    }
}
