/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    const LENGTH = 26

    const isAlphabet = (char) => {
      const array = []
      for (let i = 97; i < 97 + LENGTH; i++) {
        array.push(i)
      }

      for (let i = 65; i < 65 + LENGTH; i++) {
        array.push(i)
      }

      return array.includes(char.charCodeAt())
    }

    s = s.toLocaleLowerCase().split("").filter(char => isAlphabet(char) || !isNaN(char)).filter((char) => char !== " ").join("")

    let left = 0, right = s.length - 1
    while (left <= right) {
      if (s[left] !== s[right]) {
        return false;
      }
      left++;
      right--
    }

    return true
};