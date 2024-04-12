class Solution {
    public int trap(int[] height) {
        int l = height.length;
        int[] leftHeight = new int[l];
        int[] rightHeight = new int[l];

        leftHeight[0] = height[0];

        for(int i = 1; i< l ; i++)
        {
            leftHeight[i] = Math.max(leftHeight[i-1], height[i]);
        }

        rightHeight[l-1] = height[l-1];
        for(int i = l-2; i >= 0 ; i--)
        {
            rightHeight[i] = Math.max(rightHeight[i+1], height[i]);
        }

        int result = 0;

        for(int i = 0 ; i < l ; i++)
        {
            result += (Math.min(leftHeight[i], rightHeight[i])) - height[i];
        }

        return result;
        
    }
}