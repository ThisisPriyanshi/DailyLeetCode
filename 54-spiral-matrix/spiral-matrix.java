class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> mySpiralMatrix = new ArrayList<>();

        int rows = matrix.length;
        int column = matrix[0].length;

        int top = 0; int bottom = rows - 1; int left = 0;  int right = column-1;

        while((top <= bottom) && (left <= right))
        {   
            //for left --> right
            for(int i = left; i<= right; i++)
            {
                mySpiralMatrix.add(matrix[top][i]);
            }
            top++;

            //for top --> bottom
            for(int i = top ; i <= bottom; i++)
            {
                mySpiralMatrix.add(matrix[i][right]);
            }

            right--;

            //for right --> left
            if( top <= bottom)
            {
                for(int i = right; i >= left; i--)
                {
                    mySpiralMatrix.add(matrix[bottom][i]);
                }
            bottom--;
            }
            
            //for bottom to top
            if(left <= right)
            {
            for(int i = bottom; i >= top; i--)
            {
                mySpiralMatrix.add(matrix[i][left]);
            }
            left++;
            }

        }

        return mySpiralMatrix;
    }
}