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
}
