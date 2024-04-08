class Solution {
    public List<List<String>> solveNQueens(int n) {
        //create the board
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j <n; j++)
            {
                board[i][j] = '.';
            }
        }

        List<List<String>> listOfBoards = new ArrayList<>();
        placeQueens(board, 0, listOfBoards);
        return listOfBoards;
    }

    private void placeQueens(char[][] board, int row, List<List<String>> resultList)
    {
        //base statement
        if(row == board.length)
        {
            resultList.add(construct(board));
            return;
        }

        for(int column = 0; column < board.length; column++)
        {
            if(isSafe(board, row, column))
            {
                board[row][column] = 'Q';
                placeQueens(board, row +1, resultList);
                board[row][column] = '.';
            }
        }
    }

    private boolean isSafe(char[][] board, int row, int column)
    {
        //check vertical column
        for(int i = 0; i < row; i++)
        {
            if(board[i][column] == 'Q')
            return false;
        }

        //check diagonal left
        int maxLeft = Math.min(row, column);
        for(int i = 1; i <= maxLeft; i++)
        {
            if (board[row-i][column-i] == 'Q')
            return false;
        }

        //check diagonal right
        int maxRight = Math.min(row, board.length-1- column);
        for(int i = 1; i <= maxRight; i++)
        {
            if(board[row-i][column+i] == 'Q')
            return false;
        }

        return true;
    }

    private List<String> construct(char[][] board)
    {
        List<String> myBoard = new ArrayList<>();
        for(int i =0; i< board.length; i++)
        {
            String myRow = new String(board[i]);
            myBoard.add(myRow);
        }

        return myBoard;
    }
}