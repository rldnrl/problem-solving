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

  const deque = s.toLocaleLowerCase().split("").filter(char => isAlphabet(char) || !isNaN(char)).filter((char) => char !== " ")

  while (deque.length > 1) {
    if (deque.shift() !== deque.pop()) {
      return false;
    }
  }

  return true
};