/**
 * @param {string} s
 * @return {string}
 */
var longestPalindrome = function(s) {
    let answer = ""
    let answerLen = 0
    
    const expand = (left, right) => {
        while (left >= 0 && right < s.length && s[left] === s[right]) {
            if (right - left + 1 > answerLen) {
                answer = s.substring(left, right + 1)
                answerLen = right - left + 1
            }
            left--
            right++
        }
    }
    
    for (let i = 0; i < s.length; i++) {
        expand(i, i)
        expand(i, i + 1)
    }
    
    return answer
};