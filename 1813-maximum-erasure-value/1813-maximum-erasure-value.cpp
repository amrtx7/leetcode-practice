class Solution {
public:
    int maximumUniqueSubarray(vector<int>& nums) {
        unordered_map<int,int> mp;
        int i=0,sum=0,maxi=0;
        for(int j=0;j<nums.size();j++){
            sum+=nums[j];
            while(!mp.empty() && mp.find(nums[j])!=mp.end()){
                sum -= nums[i];
                mp.erase(nums[i]);
                i++;
            }
            mp[nums[j]] = j;
            maxi = max(maxi,sum);
        }
        return maxi;
    }
};