/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var topKFrequent = function(nums, k) {
    const answer = Array(k).fill(0)
    const bucket = new Map()
    const freq = new Map()

    for (let i = 0; i < nums.length + 1; i++) {
        bucket.set(i, [])
    }

    for (const num of nums) {
        const count = freq.get(num) ?? 0
        freq.set(num, count + 1)
    }

    for (const entry of freq.entries()) {
        const element = entry[0]
        const count = entry[1]
        bucket.get(count).push(element)
    }

    let i = 0;
    for (let count = nums.length; count >= 0; count--) {
        for (const element of bucket.get(count)) {
            answer[i++] = element
            if (i === k) {
                return answer;
            }
        }
    }

    return answer;
};