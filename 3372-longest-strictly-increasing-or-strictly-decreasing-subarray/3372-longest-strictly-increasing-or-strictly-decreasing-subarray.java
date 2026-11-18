class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int i=0,cnt1=0,cnt2=0;
        for(int j=0;j<n;j++){
            if(j<1 || nums[j] > nums[j-1]) cnt1 = Math.max(j-i+1,cnt1);
            else i=j;
        }
        i=0;
        for(int j=0;j<n;j++){
            if(j<1 || nums[j] < nums[j-1]) cnt2 = Math.max(j-i+1,cnt2);
            else i=j;
        }
        return Math.max(cnt1,cnt2);
    }
}