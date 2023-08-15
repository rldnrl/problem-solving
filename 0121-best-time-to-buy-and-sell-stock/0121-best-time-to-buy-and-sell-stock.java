class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int right = 0;
        while (right < prices.length) {
            if (prices[right] < minPrice) {
                minPrice = prices[right];
            } else if (maxProfit < prices[right] - minPrice) {
                maxProfit = prices[right] - minPrice;
            }
            right++;
        }
        
        return maxProfit;
    }
}