/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {
    const N = nums.length
    
    const leftArray = Array(N).fill(1)
    const rightArray = Array(N).fill(1)
    
    for (let i = 1; i < N; i++) {
        leftArray[i] = leftArray[i - 1] * nums[i - 1]
    }
    
    for (let i = N - 2; i >= 0; i--) {
        rightArray[i] = rightArray[i + 1] * nums[i + 1]
    }
    
    const answer = []
    
    for (let i = 0; i < N; i++) {
        answer[i] = leftArray[i] * rightArray[i]
    }
    
    return answer
};