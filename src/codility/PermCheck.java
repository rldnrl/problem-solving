package codility;

public class PermCheck {
    static int solution(int[] A) {
        int N = A.length;
        boolean[] seen = new boolean[N + 1];

        for (int num : A) {
            if (num < 1 || num > N || seen[num]) {
                return 0;
            }
            seen[num] = true;
        }

        for (int i = 1; i < N + 1; i++) {
            if (!seen[i]) {
                return 0;
            }
        }

        return 1;
    }
}
