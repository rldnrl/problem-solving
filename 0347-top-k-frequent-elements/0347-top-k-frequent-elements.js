/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var topKFrequent = function(nums, k) {
    const map = nums.reduce((prev, cur) => {
        const count = prev.get(cur) || 0
        prev.set(cur, count + 1)
        return prev
    }, new Map())
    
    const sortedArrayByMapValues = [...map.entries()]
    sortedArrayByMapValues.sort((a, b) => b[1] - a[1])
    
    const answer = []
    for (let i = 0; i < k; i++) {
        answer.push(sortedArrayByMapValues[i][0])
    }
    
    return answer
};