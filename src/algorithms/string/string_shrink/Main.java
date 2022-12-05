package algorithms.string.string_shrink;

public class Main {
    public static void main(String[] args) {
        String str = "abbb vvvv s rttt rr eeee f";
        String str2 = "abcdef";

        System.out.println("Initial: " + str);
        System.out.println("Result : " + StringShrink.shrink(str));
        System.out.println("Result2: " + StringShrink.shrink(str2));
    }
}
