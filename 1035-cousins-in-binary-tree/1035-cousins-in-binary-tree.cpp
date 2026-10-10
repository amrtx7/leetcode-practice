/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left),
 * right(right) {}
 * };
 */
class Solution {
public:
    void dfs(TreeNode* root, int level, int parent, unordered_map<int,pair<int,int>>&mp) {
        if (root == nullptr)
            return;
        mp[root->val] = {level,parent};
        dfs(root->left, level+1, root->val, mp);
        dfs(root->right, level+1, root->val, mp);
    }
    bool isCousins(TreeNode* root, int x, int y) {
        unordered_map<int,pair<int,int>> mp ;
        dfs(root, 0, -1, mp);
        return mp[x].first  == mp[y].first && mp[x].second!= mp[y].second;
    }
};