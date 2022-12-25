package leetcode;

import java.util.*;

public class EncodeAndDecodeStrings {
    public static String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String str: strs) {
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }

        return sb.toString();
    }

    public static List<String> decode(String s) {
        List<String> answer = new ArrayList<>();

        int i = 0;
        while (i < s.length()) {
            int j = i;
            while (s.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(s.substring(i, j));
            answer.add(s.substring(j + 1, j + 1 + length));
            i = j + 1 + length;
        }

        return answer;
    }
}
