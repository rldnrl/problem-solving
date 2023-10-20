package codility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OddOccurrencesInArrayTest {
    @Test
    void solutionTest() {
        int[] A1 = {9, 3, 9, 3, 9, 7, 9};
        Assertions.assertEquals(OddOccurrencesInArray.solution(A1), 7);
    }
}
