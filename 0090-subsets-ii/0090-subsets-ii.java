class Solution {
    public void solve(int[] nums, int i, List<List<Integer>> res, List<Integer> temp) {
        if (i == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        solve(nums, i + 1, res, temp);
        temp.remove(temp.size() - 1);
        i++;
        while(i<nums.length && nums[i]==nums[i-1]) i++;
        solve(nums, i, res, temp);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        solve(nums, 0, res, new ArrayList<>());
        return res;
    }
}