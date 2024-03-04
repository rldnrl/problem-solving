/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    if (s.length !== t.length) {
        return false
    }

    const LENGTH = 26

    const arrayS = Array(LENGTH).fill(0)
    const arrayT = Array(LENGTH).fill(0)

    for (const char of s) {
        arrayS[char.charCodeAt() - 'a'.charCodeAt()]++
    }

    for (const char of t) {
        arrayT[char.charCodeAt() - 'a'.charCodeAt()]++
    }

    for (let i = 0; i < LENGTH; i++) {
        if (arrayS[i] !== arrayT[i]) {
          return false
        }
    }

    return true
};