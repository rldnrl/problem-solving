package programmers.lv1;

import java.util.*;

public class HallOfFame {
    /**
     * Time Complexity: O(n * klogk)
     * Space Complexity: O(n + k)
     */
    public static int[] solutionWithSort(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            if (list.isEmpty() || list.size() < k) {
                list.add(score[i]);
                Collections.sort(list);
            } else if (list.size() == k && list.get(0) < score[i]) {
                list.remove(0);
                list.add(score[i]);
                Collections.sort(list);
            }
            answer[i] = list.get(0);
        }

        return answer;
    }

    public static int[] solutionWithPriorityQueue(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            priorityQueue.add(score[i]);
            if (priorityQueue.size() <= k) {
                answer[i] = priorityQueue.peek();
            } else {
                priorityQueue.remove();
                answer[i] = priorityQueue.peek();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] score1 = new int[]{10, 100, 20, 150, 1, 100, 200};
        System.out.println(Arrays.toString(solutionWithSort(3, score1)));
        System.out.println(Arrays.toString(solutionWithPriorityQueue(3, score1)));

        int[] score2 = new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        System.out.println(Arrays.toString(solutionWithSort(4, score2)));
        System.out.println(Arrays.toString(solutionWithPriorityQueue(4, score2)));
    }
}
