class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int counter = 0;

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column ; j++)
            {
                if(grid[i][j] == '1') {
                    counter++;
                    markMyIslands(grid, i, j);
                }
            }
        }
        return counter;
    }

    private void markMyIslands(char[][] grid, int i, int j)
    {
         if(i < grid.length && j < grid[0].length && i >= 0 && j >= 0 && grid[i][j] == '1')
         {
             grid[i][j] = '0';
             markMyIslands(grid,i, j+1); //right
             markMyIslands(grid,i+1, j);// down
             markMyIslands(grid,i, j-1);
             markMyIslands(grid,i-1,j);
         }

    }
}

