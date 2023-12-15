/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    for (let i = 0; i < nums.length; i++) {
      const complement = target - nums[i]

      if (nums.slice(i + 1).includes(complement)) {
        return [nums.indexOf(nums[i]), nums.slice(i + 1).indexOf(complement) + (i + 1)]
      }
    }
};