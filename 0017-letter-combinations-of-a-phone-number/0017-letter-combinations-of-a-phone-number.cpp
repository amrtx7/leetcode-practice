class Solution {
public:
    vector<string> table = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    void solve(string digits, int i,vector<string>& res, string& temp){
        if(i==digits.size()){
            res.push_back(temp);
            return;
        }
        for(char ch:table[(digits[i] - '0')-2]){
            temp.push_back(ch);
            solve(digits,i+1,res,temp);
            temp.pop_back();
        }
    }
    vector<string> letterCombinations(string digits) {
        vector<string> res;
        string temp;
        solve(digits,0,res,temp);
        return res;
    }
};