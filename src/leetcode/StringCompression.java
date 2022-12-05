package leetcode;

public class StringCompression {
    public static int compress(char[] chars) {
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

    public static void main(String[] args) {
        char[] test1 = new char[]{'a','a','b','b','c','c','c'};
        char[] test2 = new char[]{'a'};
        char[] test3 = new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(test1));
        System.out.println(compress(test2));
        System.out.println(compress(test3));
    }
}
