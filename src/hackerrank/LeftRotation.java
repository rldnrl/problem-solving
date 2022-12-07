package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        int size = arr.size();
        List<Integer> result = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            result.add(0);
        }

        d = d % size;
        for (int i = 0; i < size; i++) {
            result.set(i, arr.get(d));
            d = (d + 1) % size;
        }

        return result;
    }
}
