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
    public boolean dfs(TreeNode root,long maxi, long mini){
        if(root==null) return true;
        boolean ans = root.val>mini && root.val< maxi;
        return ans && dfs(root.left,root.val,mini) && dfs(root.right,maxi,root.val);
    }
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        return dfs(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }
}