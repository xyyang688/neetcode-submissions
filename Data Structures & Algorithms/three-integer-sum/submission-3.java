class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        for(int i = 0; i<nums.length-2; i++){
            if (i==0 && nums[i]>0){break;}
            if (i>0 && nums[i]==nums[i-1]){continue;}
            int j = i+1;
            int k = nums.length-1;

            while (j<k){
                if (nums[i] + nums[j] + nums[k] < 0){
                    j++;
                }
                else if (nums[i] + nums[j] + nums[k] > 0){
                    k--;
                }
                else{
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[k]);
                    list.add(l);
                    j++;
                    k--;
                    while (j<k && nums[j] == nums[j-1]){
                        j++;
                    }
                }
            }
        }

        return list;
    }
}
