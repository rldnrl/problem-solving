/**
 * @param {string[]} logs
 * @return {string[]}
 */
var reorderLogFiles = function(logs) {
    const digits = []
    const letters = []
    
    const isDigit = (value) => {
        return Number.isInteger(+value)
    }
    
    for (const log of logs) {
        if (isDigit(log.split(" ")[1][0])) {
            digits.push(log)
        } else {
            letters.push(log)
        }
    }
    
    letters.sort((s1, s2) => {
        const [id1, ...word1] = s1.split(" ")
        const [id2, ...word2] = s2.split(" ")
        
        const joinedWord1 = word1.join(" ")
        const joinedWord2 = word2.join(" ")
        
        const compared = joinedWord1.localeCompare(joinedWord2)
        
        if (compared == 0) {
            return id1.localeCompare(id2)
        } else {
            return compared
        }
    })
    
    return letters.concat(digits)
};