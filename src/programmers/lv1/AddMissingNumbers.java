package programmers.lv1;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/86051">없는 숫자 더하기</a>
 */
public class AddMissingNumbers {
    public static int solution(int[] numbers) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put(i, 0);
        }

        for (int n: numbers) {
            map.put(n, map.get(n) + 1);
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value == 0) {
                answer += key;
            }
        }

        return answer;
    }

    public static int solution2(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return 45 - sum;
    }

    public static void main(String[] args) {
        int[] numbers1 = new int[]{1,2,3,4,6,7,8,0};
        System.out.println(solution(numbers1));
        System.out.println(solution2(numbers1));

        int[] numbers2 = new int[]{5,8,4,0,6,7,9};
        System.out.println(solution(numbers2));
        System.out.println(solution2(numbers2));
    }
}
