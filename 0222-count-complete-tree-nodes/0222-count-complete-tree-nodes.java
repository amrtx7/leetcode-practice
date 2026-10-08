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
    public int lheight(TreeNode root){
        if(root==null) return 0;
        return 1 + lheight(root.left);
    }
    public int rheight(TreeNode root){
        if(root==null) return 0;
        return 1 + rheight(root.right);
    }
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int l = lheight(root);
        int r = rheight(root);
        if(l==r) return (int)Math.pow(2,l)-1;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}  