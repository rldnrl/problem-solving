package leetcode;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        HashMap<Character, Character> hashMap = new HashMap<>();

        hashMap.put(')', '(');
        hashMap.put('}', '{');
        hashMap.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (!hashMap.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else if (stack.isEmpty() || hashMap.get(s.charAt(i)) != stack.pop()) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
