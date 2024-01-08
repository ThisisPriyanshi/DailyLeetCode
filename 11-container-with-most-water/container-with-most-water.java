class Solution {
    public int maxArea(int[] height) {
      int maxWater = 0;

      int leftPointer = 0;
      int rightPointer = height.length - 1;
      int res = 0;

      while(leftPointer < rightPointer)
      {
         if(height[leftPointer] <= height[rightPointer])
         {
             res = height[leftPointer] * (rightPointer-leftPointer);
             leftPointer++;
         }
         else
         {
             res = height[rightPointer] * (rightPointer-leftPointer);
             rightPointer--;
         }

         maxWater = Math.max(res, maxWater);
      }

      return maxWater;
    }  
}