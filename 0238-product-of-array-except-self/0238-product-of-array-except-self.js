/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {
    const N = nums.length
    
    const answer = Array(N).fill(1)
    
    answer[0] = 1
    for (let i = 1; i < N; i++) {
        answer[i] = answer[i - 1] * nums[i - 1]
    }
    
    let right = 1
    for (let i = N - 1; i >= 0; i--) {
        answer[i] = right * answer[i]
        right = right * nums[i]
    }
    
    return answer
};