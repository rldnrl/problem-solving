/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    let answer = 0;
    
    const map = new Map();
    let start = 0;
    for (let end = 0; end < s.length; end++) {
        if (map.has(s[end])) {
            start = Math.max(map.get(s[end]), start);
        }
        
        answer = Math.max(answer, end - start + 1);
        map.set(s[end], end + 1);
    }
    
    return answer;
};