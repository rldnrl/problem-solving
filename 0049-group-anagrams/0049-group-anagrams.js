/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
  const map = strs.reduce((prev, str) => {
    const sortedStr = str.split("").sort().join("")
    const values = prev.get(sortedStr) || []
    values.push(str)
    prev.set(sortedStr, values)
    return prev
  }, new Map())

  return [...map.values()]
};