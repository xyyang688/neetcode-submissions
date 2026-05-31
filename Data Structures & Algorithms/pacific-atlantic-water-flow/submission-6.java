class Solution {
    // declare and initialize in one line
    private static final int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        boolean[][] pac = new boolean[heights.length][heights[0].length];
        boolean[][] atl = new boolean[heights.length][heights[0].length];

        for (int r = 0; r<heights.length; r++){
            dfs(r, 0, atl, heights);
            dfs(r, heights[0].length-1, pac, heights);
        }

        for (int c = 0; c<heights[0].length; c++){
            dfs(0, c, atl, heights);
            dfs(heights.length-1, c, pac, heights);
        }

    List<List<Integer>> list = new ArrayList<>();
    for (int row = 0; row<heights.length; row++){
        for (int col = 0; col<heights[0].length; col++){
            if (pac[row][col] && atl[row][col]){
                list.add(Arrays.asList(row, col));
            }
        }
    }

    return list;
    }



    public void dfs(int r, int c, boolean[][] ocean, int[][] heights){
        ocean[r][c] = true;
        for (int[] dir: directions){
            int nr = r + dir[0];
            int nc = c + dir[1];
            if (nr >= 0 && nc >= 0 && nr <heights.length && nc < heights[0].length && !ocean[nr][nc] && heights[nr][nc] >= heights[r][c]){
                dfs(nr, nc, ocean, heights);
            }
        }
    }
}
