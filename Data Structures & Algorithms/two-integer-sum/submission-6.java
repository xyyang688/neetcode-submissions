class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i<nums.length; i++){ // array -> .length
            int elemOne = nums[i];   // due to array, use [] instead
            for (int j = i+1; j<nums.length; j++){
                int elemTwo = nums[j];
                if ((elemOne+elemTwo) == target){
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}
