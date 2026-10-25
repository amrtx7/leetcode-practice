class Solution {
    public int peakValleyDifference(int[] nums) {
        int pc=0, vc=0;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i+1] < nums[i] && nums[i+1]<nums[i+2]) vc+=nums[i+1];
            if(nums[i+1] > nums[i] && nums[i+1]>nums[i+2]) pc+=nums[i+1];
        }
        return pc-vc;
    }
}