class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int prev = nums[0];
        boolean flag = false;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=prev){
                if(flag) return false;
                flag = true;
                if(i==1 || nums[i]>nums[i-2]){
                    prev = nums[i];
                }
            }else{
                prev = nums[i];
            }
        }
        return true;
    }
}