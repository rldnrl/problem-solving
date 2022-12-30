/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    let answer = nums[0];
    let curSum = 0;
    
    for (const num of nums) {
        if (curSum < 0) {
            curSum = 0;
        }
        curSum += num;
        answer = Math.max(answer, curSum);
    }
    
    return answer;
};