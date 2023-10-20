package codility;

public class BinaryGap {
    public static int solution(int N) {
        String bString = Integer.toString(N, 2);
        boolean started = false;
        int counter = 0;
        int maxCounter = 0;

        for (int i = 0; i < bString.length(); i++) {
            String substr = bString.substring(i, i + 1);
            if (substr.equals("1")) {
                if (started) {
                    if (counter > maxCounter) {
                        maxCounter = counter;
                    }
                }
                counter = 0;
                started = true;
            }
            if (substr.equals("0")) {
                counter++;
            }
        }

        return maxCounter;
    }
}
