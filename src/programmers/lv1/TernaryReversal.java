package programmers.lv1;

public class TernaryReversal {
    public int solution(int n) {
        String str = Integer.toString(n, 3);
        String reversed = new StringBuilder(str).reverse().toString();
        return Integer.parseInt(reversed, 3);
    }
}
