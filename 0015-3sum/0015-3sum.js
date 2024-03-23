/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
    nums.sort((a, b) => a - b)
    
    const N = nums.length
    const answer = []
    
    for (let i = 0; i < N; i++) {
        if (i > 0 && nums[i] === nums[i - 1]) {
            continue
        }
        
        let left = i + 1
        let right = N - 1
        while (left < right) {
            const threeSum = nums[i] + nums[left] + nums[right]
            if (threeSum < 0) {
                left++
            } else if (threeSum > 0) {
                right--
            } else {
                answer.push([nums[i], nums[left], nums[right]])
                left++
                while (nums[left] === nums[left - 1] && left < right) {
                    left++
                }
            }
        }
    }
    
    return answer
};