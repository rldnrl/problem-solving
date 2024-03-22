/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    const map = new Map()
    
    map.set(')', '(')
    map.set(']', '[')
    map.set('}', '{')
    
    const stack = []
    
    for (const c of s) {
        if (!map.has(c)) {
            stack.push(c)
        } else if (stack.length === 0 || map.get(c) !== stack.pop()) {
            return false
        }
    }
    
    return stack.length === 0
};