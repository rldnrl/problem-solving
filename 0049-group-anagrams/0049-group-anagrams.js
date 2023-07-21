/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
    const map = new Map()
    
    for (const str of strs) {
        const charCount = Array(26).fill(0)
        for (const c of str) {
            charCount[c.charCodeAt() - 'a'.charCodeAt()]++
        }
        const key = charCount.join(',')
        
        if (!map.has(key)) {
            map.set(key, [])
        }
        
        map.get(key).push(str)
    }
    
    return [...map.values()]
};