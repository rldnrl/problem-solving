/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(numbers, target) {
    let left = 0;
    let right = numbers.length - 1;
    
    while (left < right) {
        const l = numbers[left];
        const r = numbers[right];
        if (target < l + r) {
            right--
        } else if (target > l + r) {
            left++
        } else {
            return [left + 1, right + 1]
        }
    }
};