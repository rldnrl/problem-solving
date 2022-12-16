/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
    const map = new Map()
    strs.forEach((str) => {
        const frequency = Array.from({ length: 26 }).fill(0);
        for (const c of str) {
          frequency[c.charCodeAt(0) - 'a'.charCodeAt(0)]++;
        }

        const key = frequency.map(count => `#${count}`).join("")
        const values = map.get(key) || []
        values.push(str)
        map.set(key, values)
    })

    return [...map.values()]
};