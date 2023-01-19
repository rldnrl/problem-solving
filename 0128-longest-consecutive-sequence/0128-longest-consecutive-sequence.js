/**
 * @param {number[]} nums
 * @return {number}
 */
var longestConsecutive = function(nums) {
    if (nums.length === 0) return 0;
    
    nums.sort((a, b) => a - b);
    
    let answer = 0;
    const set = new Set(nums);
    const uniqueNums = [...set];
    
    let length = 0;
    for (let i = 1; i < uniqueNums.length; i++) {
        if (uniqueNums[i] - uniqueNums[i - 1] === 1) {
            length++;
        } else {
            answer = Math.max(answer, length + 1);
            length = 0;
        }
    }
    
    return Math.max(answer, length + 1);
};