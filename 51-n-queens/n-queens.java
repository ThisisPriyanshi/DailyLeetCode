class Solution {
    public List<List<String>> solveNQueens(int n) {
        //create board
        char[][] board = new char[n][n];
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board.length; j++)
            {
                board[i][j] = '.';
            }
        }

        //place queens
        
        List<List<String>> boardsWithQueensPlaced = new ArrayList<>();
        placeQueens(board, 0, boardsWithQueensPlaced);
        return boardsWithQueensPlaced;
    }

    private void placeQueens(char[][] board, int row, List<List<String>> boardsWithQueensPlaced)
    {   
        // base 
        if( row == board.length)
        {
            boardsWithQueensPlaced.add(construct(board));
            return;
        }

        for(int column = 0; column < board.length; column++)
        {
            if( isSafe(board, row, column))
            {
                board[row][column] = 'Q';
                placeQueens(board, row+1, boardsWithQueensPlaced);
                //backtrack
                board[row][column] = '.';
            }
        }
    }

    private boolean isSafe(char[][] board, int row, int column)
    {
        //check vertical row -->
        for(int i = 0; i < row; i++)
        {
            if(board[i][column] == 'Q')
            return false;
        }

        //check left diagonal
        int maxLeft = Math.min(row, column);
        for(int i = 1; i <= maxLeft; i++)
        {
            if (board[row-i][column-i] == 'Q')
            return false;
        }

        //check right diagonal
        int maxRight = Math.min(row, board.length - column - 1);
        for(int i = 1; i <= maxRight; i++)
        {
            if(board[row-i][column+i] == 'Q')
            return false;
            
        }

        return true;
    }

    private List<String> construct(char[][] board)
    {   
        List<String> rowString = new ArrayList<>();
        for(int i = 0; i < board.length; i++)
        {
            String row = new String(board[i]);
            rowString.add(row);
        }

        return rowString;    
    }
}