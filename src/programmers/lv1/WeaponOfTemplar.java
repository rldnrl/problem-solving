package programmers.lv1;

public class WeaponOfTemplar {
    public static int solutionWithBruteforce(int number, int limit, int power) {
        int[] divisions = new int[number];
        for (int n = 1; n <= number; n++) {
            int countOfDivision = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    countOfDivision++;
                }
            }
            divisions[n - 1] = countOfDivision;
        }

        int answer = 0;
        for (int i = 0; i < number; i++) {
            if (divisions[i] > limit) {
                answer += power;
            } else {
                answer += divisions[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int number1 = 5;
        int limit1 = 3;
        int power1 = 2;
        System.out.println(solutionWithBruteforce(number1, limit1, power1));

        int number2 = 10;
        int limit2 = 3;
        int power2 = 2;
        System.out.println(solutionWithBruteforce(number2, limit2, power2));
    }
}
