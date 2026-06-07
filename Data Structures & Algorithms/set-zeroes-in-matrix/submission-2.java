class Solution {
    public int[][] setZeroes(int[][] matrix) {
        int ROW = matrix.length;
        int COL = matrix[0].length;
        Boolean rowzero = false;

        for (int r = 0; r<ROW; r++){
            for (int c = 0; c<COL; c++){
                if (matrix[r][c] == 0){
                    if (r>0){
                        matrix[0][c] = 0;
                        matrix[r][0] = 0;                        
                    }
                    else{
                        rowzero = true;
                    }
                }
            }
        }
        for (int r = 1; r<ROW; r++){
            for (int c = 1; c<COL; c++){
                if (matrix[0][c] == 0 || matrix[r][0] == 0){
                    matrix[r][c] = 0;
                }
            }
        }

        if (matrix[0][0] == 0){
            for(int i = 0; i<ROW; i++){
                matrix[i][0] = 0;
            }
        }

        if (rowzero){
            for(int j = 0; j<COL; j++){
                matrix[0][j] = 0;
            }
        }
        return matrix;
    }
}
