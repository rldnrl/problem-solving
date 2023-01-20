/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let answer = 0;
    let minPrice = Number.MAX_VALUE;
    
    for (const price of prices) {
        if (price < minPrice) {
            minPrice = price;
        } else if (price - minPrice > answer) {
            answer = price - minPrice;
        }
    }
    
    return answer;
};