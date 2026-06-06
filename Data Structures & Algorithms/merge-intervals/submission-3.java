class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0]-b[0]);
        List<int[]> output = new ArrayList<>();
        output.add(intervals[0]);

        for (int[] interval: intervals){
            int start = interval[0];
            int end = interval[1];
            int outputend = output.get(output.size()-1)[1];

            if (start <= outputend){
                output.get(output.size()-1)[1] = Math.max(end, outputend);
            }
            else{
                output.add(interval);
            }
        }
        return output.toArray(new int[output.size()][]);
    }
}
