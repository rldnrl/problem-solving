package codility;

public class PermMissingElem {
    static int solution(int[] A) {
        int sum = 0;
        for (int i = 1; i < A.length + 2; i++) {
            sum += i;
        }

        for (int num: A) {
            sum -= num;
        }

        return sum;
    }
}
