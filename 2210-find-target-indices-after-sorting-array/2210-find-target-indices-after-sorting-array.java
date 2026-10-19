class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
        int targetCnt = 0, smallerCnt = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < target) smallerCnt++;
            else if(nums[i]==target) targetCnt++;
        }
        for(int i=0;i<targetCnt;i++){
            res.add(i+smallerCnt);
        }
        return res;
    }
}