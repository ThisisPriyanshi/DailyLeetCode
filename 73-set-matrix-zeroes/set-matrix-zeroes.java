class Solution {
    public void setZeroes(int[][] matrix) {
        
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[] rowMarker = new int[rows];
        int[] columnsMarker = new int[columns];
        //by default arrays will be initiated with 0

        for(int i = 0 ;i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                if(matrix[i][j] == 0)
                {
                    rowMarker[i] = 1;
                    columnsMarker[j] = 1;
                }
            }
        }
        
        //it is marked

        for(int k = 0; k < rows; k++)
        {
            for(int l = 0; l < columns; l++)
            {
                if((rowMarker[k] == 1) || (columnsMarker[l] == 1))
                {
                    matrix[k][l] = 0;
                }
            }
        }

        // all marked as zeroes
    }
}