package leetcode;

import java.util.*;

public class GroupAnagram {
    public static String sortString(String s) {
        String[] arrayOfS = s.split("");
        Arrays.sort(arrayOfS);
        return String.join("", arrayOfS);
    }

    public static List<List<String>> groupAnagramsWithSort(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (String s: strs) {
            String sortedS = sortString(s);
            map.computeIfAbsent(sortedS, k -> new ArrayList<>());
            map.get(sortedS).add(s);
        }

        for (Map.Entry<String, List<String>> entry: map.entrySet()) {
            result.add(entry.getValue());
        }

        return result;
    }
}
