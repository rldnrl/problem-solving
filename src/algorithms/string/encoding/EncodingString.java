package algorithms.string.encoding;

public class EncodingString {
    public static char[] encodeWhitespaces(char[] str) {
        int whitespaceCount = 0;

        for (char c: str) {
            if (Character.isWhitespace(c)) {
                whitespaceCount++;
            }
        }


        if (whitespaceCount > 0) {
            char[] encodedStr = new char[str.length + whitespaceCount * 2];
            int index = 0;

            for (char c: str) {
                if (Character.isWhitespace(c)) {
                    encodedStr[index] = '%';
                    encodedStr[index + 1] = '2';
                    encodedStr[index + 2] = '0';
                    index = index + 3;
                } else {
                    encodedStr[index] = c;
                    index = index + 1;
                }
            }

            return encodedStr;
        }

        return str;
    }

    public static char[] encodeWhitespacesWithReplace(char[] str) {
        StringBuilder sb = new StringBuilder();

        for (char c: str) {
            sb.append(c);
        }

        String input = sb.toString();
        input = input.replace(" ", "%20");

        char[] encodedStr = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            encodedStr[i] = input.charAt(i);
        }

        return encodedStr;
    }
}
