/**
 * @param {string} s
 * @param {string} t
 * @return {string}
 */
var minWindow = function(s, t) {
    if (t.length === 0) return "";
    
    const countT = new Map();
    const window = new Map();
    for (const c of t) {
        const count = countT.get(c) || 0;
        countT.set(c, count + 1);
    }
    
    let res = [-1. -1];
    let resLen = Number.MAX_VALUE;
    
    let have = 0;
    let need = countT.size;
    
    let left = 0;
    for (let right = 0; right < s.length; right++) {
        const r = s[right];
        const countOfRight = window.get(r) || 0;
        window.set(r, countOfRight + 1);
        
        if (countT.has(r) && window.get(r) === countT.get(r)) {
            have++;
        }
        
        while (have === need) {
            const l = s[left];
            if (right - left + 1 < resLen) {
                resLen = right - left + 1;
                res = [left, right];
            }
            
            const countOfLeft = window.get(l);
            window.set(l, countOfLeft - 1);
            
            if (countT.has(l) && window.get(l) < countT.get(l)) {
                have--;
            }
            
            left++;
        }
    }
    
    if (resLen === Number.MAX_VALUE) return "";
    
    return s.substring(res[0], res[1] + 1);
};