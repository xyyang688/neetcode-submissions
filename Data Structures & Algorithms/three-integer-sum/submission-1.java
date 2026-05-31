class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i = 0;
        int j = i+1;
        int k = j+1;
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int count = 0;

        while (i < nums.length-2){
            j = i+1;
            while (j < nums.length - 1){
                k = j+1;
                while (k < nums.length){
                    if (nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> sublist = new ArrayList<> (Arrays.asList(nums[i], nums[j], nums[k]));
                        sublist.sort(null);
                        if (!list.contains(sublist)){
                            list.add(sublist);
                        }
                        count ++;
                    }
                    k ++;
                }
                j ++;
            }
            i++;
        }

        if (count == 0){
            return new ArrayList<>();
        }

        return list;
    }
}
