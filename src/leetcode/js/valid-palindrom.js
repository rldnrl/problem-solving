/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    const isAlphabet = (s) => /[a-zA-Z]/.test(s)
    const isNumber = (s) => /[0-9]/.test(s)

    const arr = []

    for (const c of s) {
        if (isAlphabet(c) || isNumber(c)) {
            arr.push(c.toLowerCase())
        }
    }

    while (arr.length > 1) {
        if (arr.shift() !== arr.pop()) {
            return false
        }
    }

    return true
};
