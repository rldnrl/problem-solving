package codility;

public class TapeEquilibrium {
    static int solution(int[] A) {
        int totalSum = 0;
        for (int num: A) {
            totalSum += num;
        }

        int leftSum = 0;
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            leftSum += A[i];
            int rightSum = totalSum - leftSum;
            int diff = Math.abs(leftSum - rightSum);
            minDiff = Math.min(diff, minDiff);
        }

        return minDiff;
    }
}
