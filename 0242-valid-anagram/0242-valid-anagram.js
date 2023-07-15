/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    if (s.length !== t.length) return false;
    
    const LENGTH = 26
       
    const arrayOfS = Array(LENGTH).fill(0)
    for (let i = 0; i < s.length; i++) {
        arrayOfS[s[i].charCodeAt() - 'a'.charCodeAt()]++
    }
    
    const arrayOfT = Array(LENGTH).fill(0)
    for (let i = 0; i < t.length; i++) {
        arrayOfT[t[i].charCodeAt() - 'a'.charCodeAt()]++
    }
       
    for (let i = 0; i < LENGTH; i++) {
        if (arrayOfS[i] !== arrayOfT[i]) {
            return false
        }
    }
    
    return true
};