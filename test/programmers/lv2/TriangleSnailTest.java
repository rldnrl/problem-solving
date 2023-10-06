package programmers.lv2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import programmers.lv2.TriangleSnail;

public class TriangleSnailTest {
    @Test
    void solutionTest() {
        int input1 = 4;
        int[] result1 = new int[]{1,2,9,3,10,8,4,5,6,7};
        Assertions.assertArrayEquals(TriangleSnail.solution(input1), result1);

        int input2 = 5;
        int[] result2 = new int[]{1,2,12,3,13,11,4,14,15,10,5,6,7,8,9};
        Assertions.assertArrayEquals(TriangleSnail.solution(input2), result2);

        int input3 = 6;
        int[] result3 = new int[]{1,2,15,3,16,14,4,17,21,13,5,18,19,20,12,6,7,8,9,10,11};
        Assertions.assertArrayEquals(TriangleSnail.solution(input3), result3);
    }
}
