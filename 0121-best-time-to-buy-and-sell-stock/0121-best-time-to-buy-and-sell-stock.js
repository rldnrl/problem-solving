/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let answer = 0;
    let minPrice = Number.MAX_VALUE;
    
    for (let i = 0; i < prices.length; i++) {
        if (prices[i] < minPrice) {
            minPrice = prices[i];
        } else if (prices[i] - minPrice > answer) {
            answer = prices[i] - minPrice;
        }
    }
    
    return answer;
};