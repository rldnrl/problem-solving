package codility;

import java.util.*;

public class FrogRiverOne {
    static int solution(int[] A, int X) {
        Set<Integer> positions = new HashSet<>();

        for (int time = 0; time < A.length; time++) {
            int leafPosition = A[time];
            positions.add(leafPosition);
            if (positions.size() == X) {
                return time;
            }
        }

        return -1;
    }
}
