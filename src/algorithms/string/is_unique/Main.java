package algorithms.string.is_unique;

public class Main {
    public static void main(String[] args) {
        String text = "a b c d";
        String unicode = "豈 更 車 賈 滑 更"; // 更은 반복 사용됨
        String mixed = "a 豈 b 更 ￦";

        boolean resultText = IsUnique.isUnique(text);
        boolean resultUnicode = IsUnique.isUnique(unicode);
        boolean resultMixed = IsUnique.isUnique(mixed);

        System.out.println("ASCII text has unique characters? " + resultText);
        System.out.println("Unicode text has unique characters? " + resultUnicode);
        System.out.println("Mixed text has unique characters? " + resultMixed);
    }
}
