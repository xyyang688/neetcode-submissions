class Solution {
    public int missingNumber(int[] nums) {
        int xorn = nums.length;
        for (int i = 0; i<nums.length; i++){
            xorn ^= i^nums[i];
        }
        return xorn;
    }
}
