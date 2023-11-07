class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      int row = 0;
        int column = matrix[0].length - 1;
        
        while( row <= matrix.length -1 && column >= 0)
        {
            if(matrix[row][column] == target)
            {
                return true;
            }
            else if ( target > matrix[row][column])
            {
                row++;
            }
            else
            {
                int start = 0;
                int end = matrix[row].length - 1;
                
                while(start<=end)
                {
                    int mid = start + (end-start)/2;
                    
                    if( matrix[row][mid] == target)
                    {
                        return true;
                    }
                    else if(target < matrix[row][mid])
                    {
                        end = mid-1;
                    }
                    else if(target > matrix[row][mid])
                    {
                        start = mid+1;
                    }
                }
                row++;
            }
        }
        
        return false;
    }
}