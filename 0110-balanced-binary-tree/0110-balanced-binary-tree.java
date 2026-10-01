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
    public int depth(TreeNode root, boolean[] ans){
        if(root==null) return 0;
        int lh = 1 + depth(root.left, ans);
        int rh = 1 + depth(root.right, ans);
        int diff = Math.abs(lh-rh);
        if(diff>1) ans[0] = false;
        return Math.max(lh,rh);
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        boolean[] ans = new boolean[1];
        ans[0] = true;
        int h = depth(root,ans);
        return ans[0];
    }
}