package algorithms.string.string_shrink;

public class StringShrink {
    public static String shrink(String s) {
        StringBuilder result = new StringBuilder();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count++;
            if (!Character.isWhitespace(s.charAt(i))) {
                if ((i + 1) >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                    result.append(s.charAt(i)).append(count);
                    count = 0;
                }
            } else {
                result.append(s.charAt(i));
                count = 0;
            }
        }

        return result.length() > s.length() ? s : result.toString();
    }
}
