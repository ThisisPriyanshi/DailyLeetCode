class Solution {
    public void setZeroes(int[][] matrix) {
        //space complexity optimised solution

        int rows = matrix.length;
        int columns = matrix[0].length;

        int colZero = 1;
        //do the marking
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0 ; j < columns; j++)
            {
                if(matrix[i][j] == 0)
                {
                    //mark the iTh row
                    matrix[i][0] = 0;

                    //mark the jTh column
                    if(j != 0)
                    matrix[0][j] = 0;
                    else
                    colZero = 0;
                }
            }
        }

        //we have marked in the zero row and column
        //now we change all values but not from the 0th row and column

        for(int i = 1; i < rows; i++)
        {
            for(int j = 1; j < columns; j++)
            {
                if(matrix[i][j] != 0)
                {
                    //check for col and row
                    if( matrix[i][0] == 0 || matrix[0][j] == 0)
                    {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        //now first we take care of the zeroth row

        if(matrix[0][0] == 0)
        {
            for(int j = 0; j < columns; j++)
            {
                matrix[0][j] = 0;
            }
        }

        if(colZero == 0)
        {
            for(int i = 0; i < rows; i++)
            {
                matrix[i][0] = 0;
            }
        }
    }
}