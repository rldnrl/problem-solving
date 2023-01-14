/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    let answer = 0;
    
    const map = new Map();
    let right = 0;
    let left = 0;
    while (right < s.length) {
        const r = s[right];
        map.set(r, (map.get(r) || 0) + 1);
        while (map.get(r) > 1) {
            const l = s[left];
            map.set(l, map.get(l) - 1);
            left++;
        }
        answer = Math.max(answer, right - left + 1);
        right++;
    }
    
    return answer;
};