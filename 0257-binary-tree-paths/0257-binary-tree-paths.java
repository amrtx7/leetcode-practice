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
    public void dfs(TreeNode root, List<String> res, StringBuilder path){
        if(root == null) return ;
        if( path.length() == 0) path.append(root.val);
        else path.append("->").append(root.val);
        if(root.left==null && root.right==null) res.add(path.toString());
        dfs(root.left, res, path);
        dfs(root.right, res, path);
        System.out.println(path);
        int n = path.length();
        if(n>3){
            int l = path.lastIndexOf("->");
            path.delete(l,path.length());
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        StringBuilder path = new StringBuilder();
        ArrayList<String> res = new ArrayList<>();
        dfs(root, res, path);
        return res;
    }
}