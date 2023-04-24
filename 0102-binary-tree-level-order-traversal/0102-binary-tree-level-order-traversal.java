/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (root == null) {
            return result;
        }
        
        Deque<TreeNode> q = new ArrayDeque<>();
        Collections.addAll(q, root);
        
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.pollFirst();
                level.add(node.val);
                
                if (node.left != null) {
                    q.add(node.left);    
                }
                
                if (node.right != null) {
                    q.add(node.right);    
                } 
            }
            
            if (!level.isEmpty()) {
                result.add(level);    
            }
        }
        
        return result;
    }
}