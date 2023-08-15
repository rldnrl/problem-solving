class Solution {
    fun maxProfit(prices: IntArray): Int {
        var minPrice = Int.MAX_VALUE
        var maxProfit = 0
        var right = 0
        
        while (right < prices.size) {
            if (minPrice > prices[right]) {
                minPrice = prices[right]
            } else if (maxProfit < prices[right] - minPrice) {
                maxProfit = prices[right] - minPrice
            }
            right++
        }
        
        return maxProfit
    }
}