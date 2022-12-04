class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();

        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            count++;
            if ((i + 1) >= chars.length || chars[i] != chars[i + 1]) {
                if (count == 1) {
                    sb.append(chars[i]);
                }
                if (count > 1) {
                    sb.append(chars[i]).append(count);
                }
                count = 0;
            }
        }

        for (int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }

        return sb.length();
    }
}