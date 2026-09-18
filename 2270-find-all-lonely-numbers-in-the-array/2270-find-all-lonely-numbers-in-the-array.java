class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();

    // Frequency map
    for (int x : nums) {
        mp.put(x, mp.getOrDefault(x, 0) + 1);
    }

    List<Integer> res = new ArrayList<>();

    // Check number - 1 and number + 1
    for (Map.Entry<Integer, Integer> it : mp.entrySet()) {

        int num = it.getKey();
        int f = it.getValue();

        if (f==1 && !mp.containsKey(num - 1) &&
            !mp.containsKey(num + 1)) {

            res.add(num);
        }
    }

    return res;
    }
}