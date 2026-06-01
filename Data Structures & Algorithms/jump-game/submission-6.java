class Solution {
    public boolean canJump(int[] nums) {
        int fartherest = 0;

        for (int i = 0; i<nums.length; i++){
            if (i>fartherest){
                return false;
            }
            fartherest = Math.max(fartherest, i+nums[i]);

            if (fartherest>=nums.length-1){
                return true;
            }
        }

        return true;
    }
}
