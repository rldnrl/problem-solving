class Solution {
    public int uniquePaths(int m, int n) {
        int[][] answer = new int[m][n];
        
        for (int row = 0; row < m; row++) {
            Arrays.fill(answer[row], 1);    
        }
        
        
        for (int row = 1; row < m; row++) {
            for (int col = 1; col < n; col++) {
                answer[row][col] = answer[row - 1][col] + answer[row][col - 1];
            }
        }
        
        return answer[m - 1][n - 1];
    }
}