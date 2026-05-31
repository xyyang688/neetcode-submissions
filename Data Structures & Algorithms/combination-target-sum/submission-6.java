class Solution {
    // define list first
    List<List<Integer>> list;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        list = new ArrayList<>();
        Arrays.sort(nums);

        dfs(0, new ArrayList<>(), 0, nums, target);
        return list;
    }

    private void dfs(int i, List<Integer> cur, int total, int[] nums, int target){
        if (total == target){
            list.add(new ArrayList<>(cur));
            return;
        }

        for (int j= i; j<nums.length; j++){
            if (total + nums[j] > target){
                // no result add to the output list
                return;
            }
            cur.add(nums[j]);
            dfs(j, cur, total + nums[j], nums, target);
            // empty cur before next loop
            cur.remove(cur.size()-1);
        }
    }
}
