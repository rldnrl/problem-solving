package leetcode.java;

import java.util.*;

public class CarFleet {
    static private class Pair<L, R> {
        L left;
        R right;

        private Pair(L left, R right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    int solution(int target, int[] position, int[] speed) {
        int length = position.length;
        List<Pair<Integer, Integer>> pairs = new LinkedList<>();

        for (int i = 0; i < length; i++) {
            pairs.add(new Pair<>(position[i], speed[i]));
        }

        Stack<Double> stack = new Stack<>();
        pairs.sort((o1, o2) -> (!Objects.equals(o1.left, o2.left) ? o2.left - o1.left : o2.right.compareTo(o1.right)));

        for (Pair<Integer, Integer> pair: pairs) {
            System.out.println(pair.toString());
            int p = pair.left;
            double s = (double)pair.right;
            stack.push((target - p) / s);

            if (stack.size() >= 2 && stack.get(stack.size() - 1) <= stack.get(stack.size() - 2)) {
                stack.pop();
            }
        }

        return stack.size();
    }

    public static void main(String[] args) {
        int[] position1 = new int[]{10,8,0,5,3};
        int[] speed1 = new int[]{2,4,1,1,3};
        CarFleet carFleet = new CarFleet();
        System.out.println(carFleet.solution(12, position1, speed1));
    }
}
