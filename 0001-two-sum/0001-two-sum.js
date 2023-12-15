/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    for (let i = 0; i < nums.length; i++) {
        const num = nums[i]
        const complement = target - num
        
        if (nums.slice(i + 1).includes(complement)) {
            return [nums.indexOf(num), nums.slice(i + 1).indexOf(complement) + (i + 1)]
        }
    }
};