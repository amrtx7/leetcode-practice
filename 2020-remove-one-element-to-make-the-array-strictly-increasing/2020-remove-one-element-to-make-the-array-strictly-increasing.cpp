class Solution {
public:
  bool check(vector<int>& arr){
        for(int i=1;i<arr.size();i++){
            if(arr[i-1]>=arr[i]) return false;
        }
        return true;
    }
    bool canBeIncreasing(vector<int>& nums) {
        for(int i=0;i<nums.size();i++){
            vector<int> arr;
            for(int j=0;j<nums.size();j++){
                if(i!=j){
                    arr.push_back(nums[j]);
                }
            }
            if(check(arr)) return true;

        }
        return false;
    }
};