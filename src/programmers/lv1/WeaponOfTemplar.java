package programmers.lv1;

public class WeaponOfTemplar {
    public static int solutionWithBruteforce(int number, int limit, int power) {
        int[] arrayOfCount = new int[number];
        for (int n = 1; n <= number; n++) {
            int countOfDivision = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    countOfDivision++;
                }
            }
            arrayOfCount[n - 1] = countOfDivision;
        }

        int answer = 0;
        for (int i = 0; i < number; i++) {
            if (arrayOfCount[i] > limit) {
                answer += power;
            } else {
                answer += arrayOfCount[i];
            }
        }

        return answer;
    }

    public static int solutionWithOptimization(int number, int limit, int power) {
        int[] arrayOfCount = new int[number];

        for (int n = 1; n <= number; n++) {
            int countOfDivision = 0;
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    countOfDivision++;
                    if (i != n / i) {
                        countOfDivision++;
                    }
                }
            }
            arrayOfCount[n - 1] = countOfDivision;
        }

        int answer = 0;
        for (int i = 0; i < number; i++) {
            if (arrayOfCount[i] > limit) {
                answer += power;
            } else {
                answer += arrayOfCount[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int number1 = 5;
        int limit1 = 3;
        int power1 = 2;
        System.out.println(solutionWithBruteforce(number1, limit1, power1));
        System.out.println(solutionWithOptimization(number1, limit1, power1));

        int number2 = 10;
        int limit2 = 3;
        int power2 = 2;
        System.out.println(solutionWithBruteforce(number2, limit2, power2));
        System.out.println(solutionWithOptimization(number2, limit2, power2));
    }
}
