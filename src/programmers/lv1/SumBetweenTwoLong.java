package programmers.lv1;

public class SumBetweenTwoLong {
    public static long solution(int a, int b) {
        long answer = 0;

        long start = Math.min(a, b);
        long end = Math.max(a, b);

        for (long i = start; i <= end; i++) {
            answer += i;
        }

        return answer;
    }
}
