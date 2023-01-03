package leetcode;

public class ContainerWithMostWater {
    /**
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     */
    public static int maxAreaWithBruteforce(int[] height) {
        int answer = 0;
        for (int left = 0; left < height.length; left++) {
            for (int right = left + 1; right < height.length; right++) {
                int area = (right - left) * Math.min(height[left], height[right]);
                answer = Math.max(answer, area);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxAreaWithBruteforce(height));
    }
}
