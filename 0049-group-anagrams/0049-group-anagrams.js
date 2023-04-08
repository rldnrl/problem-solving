/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
    const hashMap = new Map();

    for (const str of strs) {
      const sortedStr = str.split("").sort().join("");
      const arrayInHashMap = hashMap.get(sortedStr) || [];
      arrayInHashMap.push(str);
      hashMap.set(sortedStr, arrayInHashMap)
    }

    return [...hashMap.values()];
};