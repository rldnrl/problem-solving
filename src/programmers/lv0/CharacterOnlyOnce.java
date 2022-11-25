package programmers.lv0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120896">한 번만 등장한 문자</a>
 */
public class CharacterOnlyOnce {

    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        HashMap<Character, Integer> charsMap = new HashMap<>();

        for (char c: s.toCharArray()) {
            charsMap.put(c, charsMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charsMap.entrySet()) {
            if (entry.getValue() == 1) {
                answer.append(entry.getKey());
            }
        }

        String[] answerCharArray = answer.toString().split("");
        Arrays.sort(answerCharArray);

        return String.join("", answerCharArray);
    }

    public static void main(String[] args) {
        System.out.println(solution("abcabcadc"));
    }
}
