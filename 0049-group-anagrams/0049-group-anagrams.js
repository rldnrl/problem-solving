/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
    const map = strs.reduce((prev, cur) => {
        const frequency = Array.from({ length: 26 }).fill(0)
        for (const c of cur) {
            frequency[c.charCodeAt(0) - 'a'.charCodeAt(0)]++
        }
        const key = frequency.map((count) => `#${count}`).join("")
        const values = prev.get(key) || []
        values.push(cur)
        prev.set(key, values)
        
        return prev
    }, new Map())

    return [...map.values()]
};