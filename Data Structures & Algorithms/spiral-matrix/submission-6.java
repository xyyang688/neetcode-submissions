class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int[][] directions = {{0,1}, {1, 0}, {0,-1}, {-1,0}};
        int[] steps = {matrix[0].length, matrix.length-1};
        List<Integer> res = new ArrayList<>();

        int r = 0; 
        int c=-1; 
        int d=0;

        while(steps[d&1]>0){
            for(int i = 0; i<steps[d&1]; i++){
                r = r+directions[d][0];
                c = c+directions[d][1];
                res.add(matrix[r][c]);
            }
            steps[d&1] -= 1;
            d=(d+1)%4;
        }

        return res;
    }
}
