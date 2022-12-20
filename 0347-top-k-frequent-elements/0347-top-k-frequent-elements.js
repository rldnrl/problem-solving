/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var topKFrequent = function(nums, k) {
    const SIZE = nums.length;
    const frequency = new Map();
    const bucket = new Map();
    
    for (const num of nums) {
        const count = frequency.get(num) || 0;
        frequency.set(num, count + 1);
    }
    
    for (let i = 0; i < SIZE + 1; i++) {
        bucket.set(i, []);
    }
    
    for (const [num, count] of frequency.entries()) {
        bucket.get(count).push(num);
    }
    
    let index = 0;
    const answer = [];
    for (let i = SIZE; i >= 0; i--) {
        for (const num of bucket.get(i)) {
            answer[index++] = num;
            if (index === k) {
                return answer;
            }
        }
    }
};