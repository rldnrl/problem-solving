class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return solution(0, n, memo);
    }
    
    public int solution(int i, int n, int[] memo) {
        if (i > n) {
            return 0;
        }
        
        if (i == n) {
            return 1;
        }
        
        if (memo[i] > 0) {
            return memo[i];
        }
        
        memo[i] = solution(i + 1, n, memo) + solution(i + 2, n, memo);
        
        return memo[i];
    }
}