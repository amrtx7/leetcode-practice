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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null)  return res;
        q.offer(root);
        while(!q.isEmpty()){
            int n = q.size();
            for(int i=0;i<n-1;i++){
                TreeNode top = q.poll();
                if(top.left!=null) q.offer(top.left);
                if(top.right!=null) q.offer(top.right);
            }
            TreeNode right = q.poll();
            res.add(right.val);
            if(right.left!=null) q.offer(right.left);
            if(right.right!=null) q.offer(right.right);
        }
        return res;
    }
}