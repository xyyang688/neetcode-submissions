class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = nums[0];
        int cursum = 0;

        for (int num: nums){
            if (cursum < 0){
                cursum = 0;
            }
            cursum += num;
            maxsum = Math.max(maxsum, cursum);
        }

        return maxsum;
    }
}
