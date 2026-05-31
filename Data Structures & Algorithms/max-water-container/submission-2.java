class Solution {
    public int maxArea(int[] heights) {
        int j = 0;
        int r = heights.length-1;
        int max = 0;

        while (j<r){
            int newMax = Math.min(heights[j], heights[r]) * (r-j);
            max = Math.max(max, newMax);

            if (heights[j] <= heights[r]){
                j++;
            }
            else{
                r--;   //it is --
            }
        }
        return max;
    }
}
