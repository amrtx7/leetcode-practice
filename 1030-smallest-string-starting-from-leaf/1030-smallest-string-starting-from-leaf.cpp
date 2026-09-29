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
    void dfs(TreeNode* root, string& curr, string& mini) {
        if (root == nullptr) return;

        curr.push_back('a' + root->val);
        cout << curr << endl;
        if (root->left == nullptr && root->right == nullptr) {
            reverse(curr.begin(), curr.end());
            if(mini.size()==0) mini = curr;
            else if (curr.compare(mini) < 0)
                mini = curr;
            reverse(curr.begin(), curr.end());
        }

        dfs(root->left, curr, mini);
        dfs(root->right, curr, mini);

        if (curr.length() > 1)
            curr.pop_back();
    }
    string smallestFromLeaf(TreeNode* root) {
        string mini = "";
        string curr = "";
        dfs(root,curr, mini);
        return mini;
    }
};