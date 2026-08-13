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
    public TreeNode invertTree(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = null;
        TreeNode res = root;
        while(!stack.isEmpty() || root != null){
            while(root != null){
                current = root.left;
                root.left = root.right;
                root.right = current;
                stack.push(root);
                root = root.left;
            }
            root = stack.pop().right;
        }
        return res;
    }
}
