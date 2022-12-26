/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {
    const size = nums.length;
    const left = Array.from({ length: size });
    const right = Array.from({ length: size });
    
    left[0] = 1;
    for (let i = 1; i < size; i++) {
        left[i] = nums[i - 1] * left[i - 1];
    }
    
    right[size - 1] = 1;
    for (let i = size - 2; i >= 0; i--) {
        right[i] = nums[i + 1] * right[i + 1];
    }
    
    const answer = Array.from({ length: size })
    for (let i = 0; i < size; i++) {
        answer[i] = left[i] * right[i];
    }
    
    return answer;
};