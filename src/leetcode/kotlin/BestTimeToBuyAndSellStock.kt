package leetcode.kotlin

class BestTimeToBuyAndSellStock {
    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    fun maxProfitWithSlidingWindow(prices: IntArray): Int {
        var minPrice = Int.MAX_VALUE
        var maxProfit = 0
        var right = 0
        while (right < prices.size) {
            if (prices[right] < minPrice) {
                minPrice = prices[right]
            } else if (maxProfit < prices[right] - minPrice) {
                maxProfit = prices[right] - minPrice
            }

            right++
        }

        return maxProfit
    }
}