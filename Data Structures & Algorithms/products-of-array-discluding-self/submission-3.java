class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroCount = 0;

        for (int num: nums){
            if (num != 0){
                product *= num;
            }
            else{
                zeroCount ++;
            }
        }

        if (zeroCount >= 2){
            return new int[nums.length];
        }

        int[] output = new int[nums.length];
        for (int i = 0; i<nums.length; i++){
            if (zeroCount > 0){
                output[i] = (nums[i] == 0) ? product:0;
            }
            else{
                output[i] = product/nums[i];
            }
        }
        return output;
    }
}  
