class Solution {
    public int maxArea(int[] heights) {
            int leftP = 0;
            int rightP = heights.length-1;

            int currArea = 0;
            int area = 0;

            while(leftP <= rightP)
            {
                currArea = (rightP-leftP) * Math.min(heights[leftP], heights[rightP]);
                area = Math.max(currArea, area);

                if(heights[leftP] < heights[rightP])
                {
                    leftP++;
                }
                else
                {
                    rightP--;
                }
            }

            return area;
    }
}