class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (Character.isAlphabetic(c) || Character.isDigit(c)) {
                builder.append(Character.toLowerCase(c));
            }
        }
        
        return Objects.equals(builder.toString(), builder.reverse().toString());
    }
}