class Solution {
    public int totalNQueens(int n) {
        //create board
        boolean[][] board = new boolean[n][n];
        return placeQueens(board, 0);

    }

    private int placeQueens(boolean[][] board, int row)
    {
        //base statement

        if(row == board.length)
        {
            return 1;
        }

        int count = 0;
        for(int column = 0; column < board.length; column++)
        {
            if( isSafe(board, row, column))
            {
                board[row][column] = true;
                count += placeQueens(board, row + 1);
                //backtrack
                board[row][column] = false;
            }

        }

        return count;
    }

    private boolean isSafe(boolean[][] board, int row, int column)
    {
        //vertical column
        for(int i =0; i < row; i++)
        {
            if(board[i][column])
            return false;
        }

        //diagoal left
        int maxLeft = Math.min(row, column);
        for(int i = 1; i <= maxLeft; i++)
        {
            if(board[row-i][column-i])
            return false;
        }

        //diagonal right
        int maxRight = Math.min(row, board.length-1-column);
        for(int i = 1; i <= maxRight; i++)
        {
            if(board[row-i][column+i])
            return false;
        }

        return true;
    }
}