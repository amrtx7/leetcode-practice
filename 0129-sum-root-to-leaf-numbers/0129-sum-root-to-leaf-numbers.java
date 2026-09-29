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
    public void dfs(TreeNode root, int[] helper){
        if(root == null) return;
        helper[0] = helper[0]*10 + root.val;
        if(root.left == null && root.right==null){
            helper[1]+=helper[0];
        }
        dfs(root.left, helper);
        dfs(root.right, helper);
        helper[0]/=10;
    }
    public int sumNumbers(TreeNode root) {
        int[] helper = new int[2];
        helper[0] = 0;
        helper[1] = 0;
        // helper[0] = curr val, helper[1] = total sum
        dfs(root, helper);
        return helper[1];
    }
}