/**
 * @param {string} s
 * @return {number}
 */
var firstUniqChar = function(s) {
    const map = new Map();
    
    for (const c of s) {
        const count = map.get(c) || 0;
        map.set(c, count + 1);
    }
    
    for (let i = 0; i < s.length; i++) {
        if (map.get(s[i]) === 1) {
            return i;
        }
    }
    
    return -1;
};