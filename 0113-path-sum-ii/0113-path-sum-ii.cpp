/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    void solve(TreeNode* root, int t, vector<vector<int>>& res, vector<int>& path){
        if(root == NULL) return;
        path.push_back(root->val);
        t-=root->val;
        if(root->left == NULL && root->right == NULL && t==0){
            res.push_back(path);
        }
        solve(root->left, t, res, path);
        solve(root->right, t, res, path);
        path.pop_back();

    }
    vector<vector<int>> pathSum(TreeNode* root, int targetSum) {
        vector<vector<int>> res;
        vector<int> path;
        solve(root, targetSum, res,path);
        return res;
    }
};