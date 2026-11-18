class Solution {
public:
    void solve(int sum,int &i, vector<int>& temp, vector<vector<int>>& res,vector<int> candidates ,int target){
        if(sum > target){
            return;
        }
        if(sum == target){

            res.push_back(temp);
            return;
        }
        for(int j=i;j<candidates.size();j++){
            temp.push_back(candidates[j]);
            solve(sum + candidates[j],j,temp,res,candidates,target);
            temp.pop_back();
        }
    }
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<int> temp;
        vector<vector<int>> res;
        int i=0;
        solve(0,i,temp,res, candidates,target);
        return res;
    }
};