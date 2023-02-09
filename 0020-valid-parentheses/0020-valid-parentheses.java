class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put('}', '{');
        brackets.put(']', '[');
        
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (!brackets.containsKey(c)) {
                stack.push(c);
            } else if (stack.isEmpty() || brackets.get(c) != stack.pop()) {
                return false;
            }
        }
        
        return stack.isEmpty();
    }
}