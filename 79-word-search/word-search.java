class Solution {
    public boolean exist(char[][] board, String word) 
    {
        int tRow = board.length;
        int tCol = board[0].length;

        for(int currRow = 0; currRow < tRow; currRow++)
        {
            for(int currCol = 0; currCol < tCol; currCol++)
            {
                if(board[currRow][currCol] == word.charAt(0))
                {
                    if (isPresent(currRow, currCol, tRow, tCol, board, word, 0))
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isPresent(int row, int col, int tRow, int tCol, char[][] board, String word, int k)
    {
        //base statement

        if(k == word.length())
        return true ;

        if(row == tRow || col == tCol || row < 0 || col < 0 || board[row][col] != word.charAt(k))
        {
            return false;
        }

        char ch = board[row][col];
        //we are considering this block so we mark it
        board[row][col] = '#';

        //call recursion to take things forward
        boolean ans = isPresent(row+1, col, tRow, tCol, board, word, k+1);
        boolean ans1 = isPresent(row-1, col, tRow, tCol, board, word, k+1);
        boolean ans2 = isPresent(row, col+1, tRow, tCol, board, word, k+1);
        boolean ans3 = isPresent(row, col-1, tRow, tCol, board, word, k+1);

        board[row][col] = ch;

        return ( ans || ans1 || ans2 || ans3);

    }
}