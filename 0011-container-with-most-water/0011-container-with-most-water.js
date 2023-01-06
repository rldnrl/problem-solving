/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    let answer = 0;
    let left = 0;
    let right = height.length - 1;
    
    while (left < right) {
        const width = right - left;
        const area = width * Math.min(height[left], height[right]);
        answer = Math.max(answer, area)
        
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    
    return answer;
};