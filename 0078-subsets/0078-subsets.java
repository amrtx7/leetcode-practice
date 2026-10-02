class Solution {
    public void solve(int[] nums, int i, List<List<Integer>> res, List<Integer> temp) {
        if (i == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        solve(nums, i + 1, res, temp);
        temp.add(nums[i]);
        solve(nums, i + 1, res, temp);
        temp.remove(temp.size() - 1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        solve(nums, 0, res, new ArrayList<>());
        return res;
    }
}