/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
    const map = strs.reduce((prev, str) => {
    const sortedStr = str.split("").sort().join("")
    if (prev.get(sortedStr)) {
      prev.get(sortedStr).push(str)
    } else {
      prev.set(sortedStr, [str])
    }
    return prev
  }, new Map())

  return Array.from(map.values())
};