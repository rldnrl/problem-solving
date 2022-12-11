package programmers.lv1;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/140108">문자열 나누기</a>
 */
public class DivisionString {
    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int solution(String s) {
        int answer = 0;
        int count = 0;
        char x = s.charAt(0);
        for (char c: s.toCharArray()) {
            if (count == 0) {
                answer++;
                x = c;
            }
            if (x == c) {
                count++;
            } else {
                count--;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("banana"));
        System.out.println(solution("abracadabra"));
        System.out.println(solution("aaabbaccccabba"));
    }
}
