/**
 * Encodes a list of strings to a single string.
 *
 * @param {string[]} strs
 * @return {string}
 */
var encode = function(strs) {
    let answer = "";
    
    for (const str of strs) {
        answer += str.length;
        answer += "#";
        answer += str;
    }
    
    return answer;
};

/**
 * Decodes a single string to a list of strings.
 *
 * @param {string} s
 * @return {string[]}
 */
var decode = function(s) {
    const answer = [];
    
    let i = 0;
    while (i < s.length) {
        let j = i;
        while (s[j] !== "#") {
            j++;
        }
        const length = +s.substring(i, j);
        answer.push(s.substring(j + 1, j + 1 + length))
        i = j + 1 + length;
    }
    
    return answer;
};

/**
 * Your functions will be called as such:
 * decode(encode(strs));
 */