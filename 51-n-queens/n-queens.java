class Solution {
    public List<List<String>> solveNQueens(int n) {
         //create board and initialize with '.'
        char[][] board = new char[n][n];
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                board[i][j] = '.';
            }
        }
        List<List<String>> myBoard = new ArrayList<>();
        placeQueens(board, 0, myBoard);
        return myBoard;
    }

    public void placeQueens(char[][] board,int row, List<List<String>> list)
    {
        if(row == board.length) //we have reached the last row 
        {
            list.add(construct(board));
            return;
        }

        for(int col = 0; col < board.length; col++)
        {
            //place the queen after checking if its a safe position
            if(isSafe(board, row, col))
            {
            board[row][col] = 'Q';
            placeQueens(board, row+1, list);
            //backtrack
            board[row][col] = '.';
            }
        }
    }

    public boolean isSafe(char[][] board, int row, int col)
    {
        //check vertical row 
        for(int i = 0; i < row; i++)
        {
            if(board[i][col] == 'Q')
            return false;
        }

        //diagonal left
        int maxLeft = Math.min(row, col);
        for(int i = 1; i <= maxLeft; i++)
        {
            if (board[row-i][col-i]== 'Q')
                return false;
        }

        //diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for(int i = 1; i <= maxRight; i++)
        {
            if (board[row-i][col+i] == 'Q')
                return false;
        }

        return true;
    }

    public List<String> construct(char[][] board) {

        List<String> internal = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String row = new String(board[i]);
            internal.add(row);
        }
        return internal;

    }

}