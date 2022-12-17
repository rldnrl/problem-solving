/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    const result = []
    const map = new Map()
    
    nums.forEach((num, index) => {
        map.set(num, index)
    })
    
    for (let i = 0; i < nums.length; i++) {
        const element = nums[i]
        result.push(i)
        if (map.has(target - element) && map.get(target - element) !== i) {
            result.push(map.get(target - element))
            return result
        } else {
            result.pop()
        }
    }
};