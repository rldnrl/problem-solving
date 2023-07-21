package leetcode.java;

import java.util.Stack;

public class ReverseString {
    public static void reverseStringWithStack(char[] s) {
        Stack<Character> stack = new Stack<>();

        for (char c: s) {
            stack.push(c);
        }

        int i = 0;
        while (!stack.isEmpty()) {
            s[i] = stack.pop();
            i++;
        }
    }

    public static void reverseStringWithTwoPointer(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
