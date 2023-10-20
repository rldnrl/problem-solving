package codility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FrogJmpTest {
    @Test
    void solution() {
        Assertions.assertEquals(FrogJmp.solution(10, 85, 30), 3);
        Assertions.assertEquals(FrogJmp.solution(10, 70, 30), 2);
    }
}
