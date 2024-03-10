class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int currRow = 0;
        int currCol = columns - 1;

        while((currRow <= rows-1) && (currCol >= 0))
        {
            if(matrix[currRow][currCol] == target)
            return true;

            if(matrix[currRow][currCol] < target)
            {
                currRow++;
            }
            else
            {
                int start = 0;
                int end = matrix[currRow].length -1;

                while(start <= end)
                {
                    int mid = start + (end-start)/2;

                    if(matrix[currRow][mid] == target)
                    {
                        return true;
                    }

                    if(matrix[currRow][mid] > target)
                    {
                        end = mid -1;
                    }
                    else
                    {
                        start = mid+1;
                    }
                }

                currRow++;
            }
        }

        return false;
    }
}