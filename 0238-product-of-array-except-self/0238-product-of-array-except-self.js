/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {
    const size = nums.length;
    const answer = Array.from({ legnth: size });
    
    answer[0] = 1
    for (let i = 1; i < size; i++) {
        answer[i] = answer[i - 1] * nums[i - 1];
    }
    
    let right = 1;
    for (let i = size - 1; i >= 0; i--) {
        answer[i] = answer[i] * right;
        right = right * nums[i];
    }
    
    return answer;
};