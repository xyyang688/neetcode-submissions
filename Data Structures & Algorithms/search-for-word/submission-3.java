class Solution {
    int rows;
    int columns;

    public boolean exist(char[][] board, String word) {
        rows = board.length;
        columns = board[0].length;

        for (int i = 0; i<rows; i++){
            for (int j = 0; j<columns; j++){
                if (dfs(board, word, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int i, int j, int index){
        if (index == word.length()){
            return true;
        }

        if (i < 0  || j<0 || i >= rows || j>= columns || board[i][j] != word.charAt(index) || board[i][j] == '#'){
            return false;
        }

        board[i][j] = '#';
        boolean res = dfs(board, word, i+1, j, index+1)||
        dfs(board, word, i-1, j, index+1)||
        dfs(board, word, i, j+1, index+1)||
        dfs(board, word, i, j-1, index+1);
        board[i][j] = word.charAt(index);
        return res;
    }
}
