/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {boolean}
 */
var isValidBST = function(root) {
    return validate(root, null, null);
};

/**
 * @param {TreeNode} root
 * @param {number} left
 * @param {number} right
 * @return {boolean}
 */
var validate = (root, left, right) => {
    if (root === null) {
        return true
    }
    
    if ((left !== null && root.val <= left) || (right !== null && root.val >= right)) {
        return false
    }
    
    return validate(root.right, root.val, right) && validate(root.left, left, root.val)
}