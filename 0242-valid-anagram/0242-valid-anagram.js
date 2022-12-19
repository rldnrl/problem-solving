/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    if (s.length !== t.length) return false
    
    const frequency = Array.from({ length: 26 }).fill(0)
    
    for (let i = 0; i < s.length; i++) {
        const charOfS = s[i]
        const charOfT = t[i]
        
        frequency[charOfS.charCodeAt(0) - 'a'.charCodeAt(0)]++
        frequency[charOfT.charCodeAt(0) - 'a'.charCodeAt(0)]--
    }
    
    for (const f of frequency) {
        if (f !== 0) {
            return false
        }
    }
    
    return true
};