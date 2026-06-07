class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        int res = 0;
        int prevEnd = intervals[0][1];

        for (int i = 1; i<intervals.length; i++){
            int[] interval = intervals[i];
            int start = interval[0];
            int end = interval[1];
            // if there's a common point, it is overlap
            if (start >= prevEnd){
                prevEnd = end;
            }
            else{
                prevEnd = Math.min(end, prevEnd);
                res++;
            }
        }

        return res;
    }
}
