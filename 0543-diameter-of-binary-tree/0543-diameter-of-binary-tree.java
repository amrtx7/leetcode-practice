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
    public int dfs(TreeNode root, int[] maxi){
        if(root==null )return 0;
        int left = dfs(root.left,maxi);
        int right = dfs(root.right,maxi);
        int h = Math.max(left,right) + 1;
        int diameter = left + right;
        maxi[0] =  Math.max(maxi[0],diameter);
        return h;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int[] maxi = new int[1];
        maxi[0] = 0;
        dfs(root, maxi);
        return maxi[0];
    }
}