class Solution {
    public void reverseString(char[] s) {
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
}