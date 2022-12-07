package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class ReverseArray {
    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        int size = a.size();
        List<Integer> result = new ArrayList<>(size);

        result.addAll(a);

        int left = 0;
        int right = a.size() - 1;

        int temp;
        while (left < right) {
            temp = result.get(left);
            result.set(left, a.get(right));
            result.set(right, temp);
            left++;
            right--;
        }

        return result;
    }
}
