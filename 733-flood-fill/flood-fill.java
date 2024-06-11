class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];

        if (originalColor == color)
            return image;

        int row = image.length;
        int col = image[0].length;

        fillIt(image, sr, sc, row, col, color, originalColor);

        return image;
    }

    private void fillIt(int[][] image, int currRow, int currCol, int row, int col, int color, int original)
    {
        //base statement 
        if(currRow < 0 || currCol < 0 || currRow == row || currCol == col ||image[currRow][currCol] != original)
        {
            return;
        }

        image[currRow][currCol] = color;

        //call for recusrion ina ll 4 directions

        fillIt(image, currRow+1, currCol, row, col, color, original);
        fillIt(image, currRow-1, currCol, row, col, color, original);
        fillIt(image, currRow, currCol-1, row, col, color, original);
        fillIt(image, currRow, currCol+1, row, col, color, original);
    }
}