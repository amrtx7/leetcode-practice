class Solution {
public:
    vector<string> split(string s){
        int n = s.size();
        string temp = "";
        vector<string> res;
        for(int i=0;i<n;i++){
            while(i<n && s[i]!=' ') temp.push_back(s[i++]);
            res.push_back(temp);
            temp = "";
        }
        return res;
    }
    bool wordPattern(string pattern, string s) {
        vector<string> ss = split(s);
        unordered_map<string,char> mp;
        unordered_map<char,string> mp2;
        if(pattern.size()!=ss.size()) return false;
        for(int i=0;i<ss.size();i++){
            if((mp.count(ss[i])>0 || mp2.count(pattern[i])>0) && 
            (mp[ss[i]]!=pattern[i] || mp2[pattern[i]]!=ss[i] )) return false;
            mp[ss[i]] = pattern[i];
            mp2[pattern[i]] = ss[i];
        }
        return true;
    }
};