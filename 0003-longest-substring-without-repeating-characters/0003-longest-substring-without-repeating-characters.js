/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    let answer = 0;
    const set = new Set();
    
    let left = 0;
    for (let right = 0; right < s.length; right++) {
        const r = s[right];
        
        while (set.has(r)) {
            const l = s[left];
            set.delete(l);
            left++;
        }
        
        set.add(r);
        answer = Math.max(answer, right - left + 1);
    }
    
    return answer;
};