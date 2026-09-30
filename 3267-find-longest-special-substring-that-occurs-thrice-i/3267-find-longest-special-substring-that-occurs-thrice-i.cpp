class Solution {
public:
    int maximumLength(string s) {
        int n = s.size();
        unordered_map<string, int> mp;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                string substr = "";
                if(j-i==0) mp[s.substr(i,1)]++;
                else{
                    int all_equal = 0;
                    int k=i;
                    while(k+1<=j && s[k+1]==s[k]){
                        all_equal++;
                        k++;
                    }
                    if(all_equal+1 == j-i+1) mp[s.substr(i,j-i+1)]++;
                }
            }
        }
        string res="";
        for(auto it:mp){
            // if(it.second>=3)
                cout << it.first << " " << it.second;
            if(it.second >=3 && it.first.size()>res.size()){
                cout << " eligible" << endl;
                res = it.first;
            }
        }
        cout << "final res - " << res << endl;
        return (res!="")?res.length():-1;
    }
};