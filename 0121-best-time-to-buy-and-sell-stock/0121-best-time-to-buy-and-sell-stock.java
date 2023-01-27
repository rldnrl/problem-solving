class Solution {
    public int maxProfit(int[] prices) {
        int answer = 0;
        int minPrice = Integer.MAX_VALUE;
        
        int right = 0;
        while (right < prices.length) {
            if (prices[right] < minPrice) {
                minPrice = prices[right];
            } else if (prices[right] - minPrice > answer) {
                answer = Math.max(answer, prices[right] - minPrice);
            }
            
            right++;
        }
        
        return answer;
    }
}