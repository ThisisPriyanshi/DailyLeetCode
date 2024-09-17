class Solution {
    public int maxArea(int[] heights) {
            int leftP = 0;
            int rightP = heights.length-1;

            int currArea = 0;
            int area = 0;

            while(leftP < rightP)
            {
                int minHeight = Math.min(heights[leftP], heights[rightP]);
                currArea = (rightP-leftP) * minHeight ;
                area = Math.max(currArea, area);

                while(leftP < rightP && heights[leftP] <= minHeight)
                {
                    leftP++;
                }

                while(leftP < rightP && heights[rightP] <= minHeight)
                {
                    rightP--;
                }
            }

            return area;
    }
}