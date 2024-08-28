class Solution {
    private int n, m;
    private int[] X = {1, 0, -1, 0};
    private int[] Y = {0, -1, 0, 1};
    
    private boolean check(int i, int j, int[][] grid1, int[][] grid2) {
        if ((grid1[i][j] == 1 && grid2[i][j] == 0) || (grid1[i][j] == 0 && grid2[i][j] == 0)) {
            return true;
        }
        if (grid1[i][j] == 0 && grid2[i][j] == 1) {
            return false;
        }
        
        grid1[i][j] = 0;
        grid2[i][j] = 0;
        
        boolean isSubIsland = true;
        for (int k = 0; k < 4; k++) {
            int newX = X[k] + i;
            int newY = Y[k] + j;
            if (newX < n && newY < m && newX >= 0 && newY >= 0) {
                if (!check(newX, newY, grid1, grid2)) {
                    isSubIsland = false;
                }
            }
        }
        return isSubIsland;
    }
    
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        n = grid1.length;
        m = grid1[0].length;
        
        int subIslands = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid1[i][j] == 1 && grid2[i][j] == 1 && check(i, j, grid1, grid2)) {
                    subIslands++;
                }
            }
        }
        return subIslands;
    }
}