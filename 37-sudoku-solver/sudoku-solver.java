class Solution {
    public boolean solveSudoku(char[][] board) {
       for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        if (board[i][j] == '.') {

          for (char c = '1'; c <= '9'; c++) {
            if (isValid(board, i, j, c)) {
              board[i][j] = c;

              if (solveSudoku(board))
                return true;
              else
                board[i][j] = '.';
            }
          }

          return false;
        }
      }
    }
    return true;
  }

  public static boolean isValid(char[][] board, int row, int col, char num) {
    // check the row
        for (int i = 0; i < board.length; i++) {
            // check if the number is in the row
            if (board[row][i] == num) {
                return false;
            }
        }

        // check the col
        for (char[] nums : board) {
            // check if the number is in the col
            if (nums[col] == num) {
                return false;
            }
        }

        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}
